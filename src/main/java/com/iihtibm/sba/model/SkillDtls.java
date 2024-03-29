package com.iihtibm.sba.model;

public class SkillDtls extends AuditModel {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String toc;
	private String prerequisites;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
}
