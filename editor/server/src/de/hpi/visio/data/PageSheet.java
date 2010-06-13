package de.hpi.visio.data;

import org.xmappr.Element;
import org.xmappr.RootElement;

@RootElement("PageSheet")
public class PageSheet {
	
	@Element("PageProps")
	public PageProperties properties;
	
	public Double getWidth() {
		if (properties == null) 
			properties = new PageProperties();
		return properties.getWidth();
	}
	
	public void setWidth(Double width) {
		properties.setWidth(width);
	}
	
	public Double getHeight() {
		if (properties == null) 
			properties = new PageProperties();
		return properties.getHeight();
	}	
	
	public void setHeight(Double height) {
		properties.setHeight(height);
	}

}
