package net.viralpatel.jsp.custom.taglib;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class SubstrTagHandler extends TagSupport {
	private String input;
	private int start;
	private int end;
	
	@Override
	public int doStartTag() throws JspException {
		
		try {
			//Get the writer object for output.
			JspWriter out = pageContext.getOut();

			//Perform substr operation on string.
			out.println(input.substring(start, end));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
}
