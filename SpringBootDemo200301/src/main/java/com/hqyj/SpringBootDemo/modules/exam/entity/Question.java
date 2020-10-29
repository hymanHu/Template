package com.hqyj.SpringBootDemo.modules.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Description: 试题
 * @author HymanHu
 * @date 2020-10-29 11:24:29
 */
@Entity
@Table(name = "question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// 单选题、多选题、填空题、简答题、编程题
	private String type;
	// JavaSE、JavaEE、Spring、SpringBoot、SpringCloud、PythonBase、PythonSpider……
	private String flag;
	private Double score;
	private String content;
	@Column(name = "option_a")
	private String optionA;
	@Column(name = "option_b")
	private String optionB;
	@Column(name = "option_c")
	private String optionC;
	@Column(name = "option_d")
	private String optionD;
	private String referenceAnswer;
	private String comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getReferenceAnswer() {
		return referenceAnswer;
	}

	public void setReferenceAnswer(String referenceAnswer) {
		this.referenceAnswer = referenceAnswer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
