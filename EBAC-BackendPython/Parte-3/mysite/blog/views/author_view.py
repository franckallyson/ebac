from django.views import generic
from blog.models import Author


class AuthorView(generic.ListView):
    queryset = Author.objects.order_by('-id')
    template_name = "authors.html"


class AuthorDetailView(generic.DetailView):
    model = Author
    template_name = 'author_detail.html'
