package de.hpi.visio.data;

import org.xmappr.RootElement;
import org.xmappr.Text;

@RootElement
public class Height {

	@Text
	public Double content;
	
	public Double getHeight() {
		return content;
	} 
	
}