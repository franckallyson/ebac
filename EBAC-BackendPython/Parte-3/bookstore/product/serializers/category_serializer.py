from rest_framework import serializer

from product.models.category import Category


class CategorySerializer(serializer.ModelSerializer):
    class Meta:
        model = Category
        fields = [
            'title',
            'slug',
            'description',
            'active',
        ]