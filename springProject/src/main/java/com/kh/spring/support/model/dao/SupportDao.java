package com.kh.spring.support.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import com.kh.spring.support.model.vo.Notice;
import com.kh.spring.support.model.vo.Question;

@Mapper
public interface SupportDao {
	int selectTotalRecordNotice();

	List<Notice> selectNoticeList(RowBounds rowBounds);

	int insertNotice(Notice notice);

	int updateCountNotice(int noticeNo);
	
	Notice selectOneNotice(int noticeNo);

	int updateNotice(Notice notice);

	int deleteNotice(int noticeNo);
	
	int selectTotalRecordQuestion();

	List<Question> selectQuestionList(RowBounds rowBounds);

	int insertQuestion(Question question);
	
	int updateCountQuestion(int questionNo);
	
	Question selectOneQuestion(int questionNo);

	int updateQuestion(Question question);

	int deleteQuestion(int questionNo);

	int insertQuestionAnswer(Question question);
}