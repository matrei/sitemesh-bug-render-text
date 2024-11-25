package com.example
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
class SitemeshBugRenderTextSpec extends Specification {

    void 'should render text/html'() {
        when: 'visiting a controller endpoint that uses render(text:"...")'
            String text = new URL("http://localhost:$serverPort/renderText/withContentTypeTextHtml").text

        then: 'the response is as expected'
            text.contains('<p>Hello World</p>')
    }

    void 'should render text/plain'() {
        when: 'visiting a controller endpoint that uses render(text:"...", contentType: "text/plain")'
            String text = new URL("http://localhost:$serverPort/renderText/withContentTypeTextPlain").text

        then: 'the response is as expected'
            text == '<p>Hello World</p>'
    }

    void 'should render text'() {
        when: 'visiting a controller endpoint that uses render(String)'
            String text = new URL("http://localhost:$serverPort/renderText/withOnlyString").text

        then: 'the response is as expected'
            text == '<p>Hello World</p>'
    }
}
