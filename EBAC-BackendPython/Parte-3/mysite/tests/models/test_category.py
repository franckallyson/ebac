import pytest

from blog.factories import CategoryFactory

@pytest.fixture
def category_created():
    return CategoryFactory(name="Categoria TEste", description="Descrição categoria teste")


@pytest.mark.django_db
def test_create_category(category_created):
    assert category_created.name == 'Categoria TEste'
