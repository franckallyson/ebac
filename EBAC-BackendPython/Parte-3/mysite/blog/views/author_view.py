from django.http import HttpResponse
from django.views import generic


class AuthorView(generic.View):
    def get(self, request, *args, **kwargs):
        return HttpResponse('Hello Author')