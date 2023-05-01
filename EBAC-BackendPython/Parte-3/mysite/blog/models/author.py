from django.db import models
from django.contrib.auth.models import User


class Author(models.Model):
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    bio = models.TextField()
    photo = models.ImageField(upload_to='authors/', blank=True, null=True)

    def __str__(self):
        return f"{self.user.first_name}, {self.user.last_name}"

