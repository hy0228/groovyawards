package de.andreasschmitt.richui.taglib.renderer;

import groovy.xml.MarkupBuilder
import org.codehaus.groovy.grails.web.taglib.GroovyPageTagBody

/*
*
* @author Andreas Schmitt
*/
class CarouselItemRenderer extends AbstractRenderer {

	protected void renderTagContent(Map attrs, MarkupBuilder builder) throws RenderException {
		renderTagContent(attrs, null, builder)
	}
	
	protected void renderTagContent(Map attrs, GroovyPageTagBody body, MarkupBuilder builder) throws RenderException {			
		builder."li"(){
			builder.yieldUnescaped "${body.call()}"
		}
	}
	
	protected void renderResourcesContent(Map attrs, MarkupBuilder builder, String resourcePath) throws RenderException {

	}

}