import pytest

from blog.factories import AuthorFactory


@pytest.fixture
def author_created():
    return AuthorFactory(bio="Bio teste")


@pytest.mark.django_db
def test_create_author(author_created):
    assert author_created.bio == 'Bio teste'
