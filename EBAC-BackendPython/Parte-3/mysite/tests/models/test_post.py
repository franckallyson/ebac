import pytest

from blog.factories import PostFactory, AuthorFactory, CategoryFactory


@pytest.fixture
def post_published():
    return PostFactory(title='pytest with factory',
                       author=AuthorFactory(bio="Bio teste"),
                       category=CategoryFactory(name="Categoria teste", description="Descrição categoria teste"))


@pytest.mark.django_db
def test_create_published_post(post_published):
    assert post_published.title == 'pytest with factory'
