import factory
from faker import Factory as FakerFactory

from django.contrib.auth.models import User
from django.utils.timezone import now

from blog.models import Post, Author, Category

faker = FakerFactory.create()


class UserFactory(factory.django.DjangoModelFactory):
    class Meta:
        model = User

    email = factory.Faker("safe_email")
    username = factory.LazyAttribute(lambda x: faker.name())

    @classmethod
    def _prepare(cls, create, **kwargs):
        password = kwargs.pop("password", None)
        user = super(UserFactory, cls)._prepare(create, **kwargs)

        if password:
            user.set_password(password)
            if create:
                user.save()
        return user

class AuthorFactory(factory.django.DjangoModelFactory):
    class Meta:
        model = Author

    user = factory.SubFactory(UserFactory)
    bio = factory.LazyAttribute(lambda x: faker.text())
    photo = factory.django.ImageField(
        filename='test_image.jpg',
        width=1024,
        height=768,
        color='green',
    )

class CategoryFactory(factory.django.DjangoModelFactory):
    class Meta:
        model = Category

    name = factory.LazyAttribute(lambda x: faker.sentence())
    description = factory.LazyAttribute(lambda x: faker.text())


class PostFactory(factory.django.DjangoModelFactory):
    title = factory.LazyAttribute(lambda x: faker.sentence())
    created_on = factory.LazyAttribute(lambda x: now())
    author = factory.SubFactory(AuthorFactory)
    category = factory.SubFactory(CategoryFactory)
    status = 0

    class Meta:
        model = Post
