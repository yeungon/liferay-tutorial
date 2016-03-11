/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.blogspot.chingovan.customjsp.servicebuilder.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Book service. Represents a row in the &quot;Book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookImpl}.
 * </p>
 *
 * @author chinv
 * @see Book
 * @see com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookImpl
 * @see com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl
 * @generated
 */
public interface BookModel extends BaseModel<Book> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a book model instance should use the {@link Book} interface instead.
	 */

	/**
	 * Returns the primary key of this book.
	 *
	 * @return the primary key of this book
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this book.
	 *
	 * @param primaryKey the primary key of this book
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the book ID of this book.
	 *
	 * @return the book ID of this book
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this book.
	 *
	 * @param bookId the book ID of this book
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the title of this book.
	 *
	 * @return the title of this book
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this book.
	 *
	 * @param title the title of this book
	 */
	public void setTitle(String title);

	/**
	 * Returns the edition of this book.
	 *
	 * @return the edition of this book
	 */
	@AutoEscape
	public String getEdition();

	/**
	 * Sets the edition of this book.
	 *
	 * @param edition the edition of this book
	 */
	public void setEdition(String edition);

	/**
	 * Returns the isbn of this book.
	 *
	 * @return the isbn of this book
	 */
	@AutoEscape
	public String getIsbn();

	/**
	 * Sets the isbn of this book.
	 *
	 * @param isbn the isbn of this book
	 */
	public void setIsbn(String isbn);

	/**
	 * Returns the cover of this book.
	 *
	 * @return the cover of this book
	 */
	@AutoEscape
	public String getCover();

	/**
	 * Sets the cover of this book.
	 *
	 * @param cover the cover of this book
	 */
	public void setCover(String cover);

	/**
	 * Returns the number of page of this book.
	 *
	 * @return the number of page of this book
	 */
	public int getNumberOfPage();

	/**
	 * Sets the number of page of this book.
	 *
	 * @param numberOfPage the number of page of this book
	 */
	public void setNumberOfPage(int numberOfPage);

	/**
	 * Returns the publisher name of this book.
	 *
	 * @return the publisher name of this book
	 */
	@AutoEscape
	public String getPublisherName();

	/**
	 * Sets the publisher name of this book.
	 *
	 * @param publisherName the publisher name of this book
	 */
	public void setPublisherName(String publisherName);

	/**
	 * Returns the publisher u r l of this book.
	 *
	 * @return the publisher u r l of this book
	 */
	@AutoEscape
	public String getPublisherURL();

	/**
	 * Sets the publisher u r l of this book.
	 *
	 * @param publisherURL the publisher u r l of this book
	 */
	public void setPublisherURL(String publisherURL);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Book book);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Book> toCacheModel();

	@Override
	public Book toEscapedModel();

	@Override
	public Book toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}