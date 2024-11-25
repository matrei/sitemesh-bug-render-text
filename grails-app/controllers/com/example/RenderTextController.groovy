package com.example

class RenderTextController {

    def withContentTypeTextHtml() {
        render(
                text: '<p>Hello World</p>',
                contentType: 'text/html'
        )
    }

    def withContentTypeTextPlain() {
        render(
                text: '<p>Hello World</p>',
                contentType: 'text/plain'
        )
    }

    def withOnlyString() {
        render(
                '<p>Hello World</p>'
        )
    }
}