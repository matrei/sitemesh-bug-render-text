package com.example

class RenderTextController {

    def index() {
        render text: '<p>Hello World</p>', contentType: 'text/html'
    }
}