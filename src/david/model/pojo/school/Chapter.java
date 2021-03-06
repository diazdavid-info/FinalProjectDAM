﻿/**
 * Clase que recoge los capítulos de un temario
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:29
 */
package david.model.pojo.school;

import david.model.pojo.builder.ChapterBuilder;

public class Chapter {

	/**
	 * Tiempo dísponible para impartir el capítulo
	 */
	private int mHour;
	/**
	 * Identificador del capítulo
	 */
	private int mId;
	/**
	 * Nombre del capítulo
	 */
	private String mName;

	public Chapter(ChapterBuilder chapterBuilder) {
		mHour = chapterBuilder.getHour();
		mId = chapterBuilder.getId();
		mName = chapterBuilder.getName();
	}

	@Override
	public void finalize() throws Throwable {

	}

	/**
	 * Tiempo dísponible para impartir el capítulo
	 */
	public int getHour() {
		return mHour;
	}

	/**
	 * Identificador del capítulo
	 */
	public int getId() {
		return mId;
	}

	/**
	 * Nombre del capítulo
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Tiempo dísponible para impartir el capítulo
	 * 
	 * @param newVal
	 */
	public void setHour(int newVal) {
		mHour = newVal;
	}

	/**
	 * Identificador del capítulo
	 * 
	 * @param newVal
	 */
	public void setId(int newVal) {
		mId = newVal;
	}

	/**
	 * Nombre del capítulo
	 * 
	 * @param newVal
	 */
	public void setName(String newVal) {
		mName = newVal;
	}

}