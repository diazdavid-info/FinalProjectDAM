/**
 * Clase Column
 * @author David Díaz
 * @version 1.0
 * @date 30-05-2015
 */
package david.model.pojo.graphic;

public class Column {

	private String fillColor;

	private String strokeColor;

	private String highlightFill;

	private String highlightStroke;

	private Integer[] data;

	public Column(String fillColor, String strokeColor, String highlightFill, String highlightStroke) {
		this.fillColor = fillColor;
		this.strokeColor = strokeColor;
		this.highlightFill = highlightFill;
		this.highlightStroke = highlightStroke;
	}

	public Integer[] getData() {
		return data;
	}

	public void setData(Integer[] data) {
		this.data = data;
	}

	/**
	 * @return the fillColor
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * @param fillColor
	 *            the fillColor to set
	 */
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * @return the strokeColor
	 */
	public String getStrokeColor() {
		return strokeColor;
	}

	/**
	 * @param strokeColor
	 *            the strokeColor to set
	 */
	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}

	/**
	 * @return the highlightFill
	 */
	public String getHighlightFill() {
		return highlightFill;
	}

	/**
	 * @param highlightFill
	 *            the highlightFill to set
	 */
	public void setHighlightFill(String highlightFill) {
		this.highlightFill = highlightFill;
	}

	/**
	 * @return the highlightStroke
	 */
	public String getHighlightStroke() {
		return highlightStroke;
	}

	/**
	 * @param highlightStroke
	 *            the highlightStroke to set
	 */
	public void setHighlightStroke(String highlightStroke) {
		this.highlightStroke = highlightStroke;
	}

}
