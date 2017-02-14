package com.poei.concession.model.base;

import java.util.Date;

public class DateableItem extends ModelBase {
	private Date createAt;

	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
