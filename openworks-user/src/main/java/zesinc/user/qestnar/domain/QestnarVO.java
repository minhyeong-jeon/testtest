/*
 * Copyright (c) 2015 ZES Inc. All rights reserved.
 * This software is the confidential and proprietary information of ZES Inc.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered into
 * with ZES Inc. (http://www.zesinc.co.kr/)
 */
package zesinc.user.qestnar.domain;

import java.util.Date;

import zesinc.web.validate.annotation.marker.Digits;
import zesinc.web.validate.annotation.marker.MaxLength;
import zesinc.web.validate.annotation.marker.RequireFrom;
import zesinc.web.validate.annotation.marker.Required;
import zesinc.web.vo.PageVO;

/**
 * 설문조사 정보 VO 클레스
 * 
 * <pre>
 * << 개정이력(Modification Information) >>
 *    
 *     수정일       수정자   수정내용
 * --------------  --------  -------------------------------
 *  2015-07-28.    방기배   최초작성
 * </pre>
 * 
 * @author (주)제스아이엔씨 기술연구소
 * @see
 */
public class QestnarVO extends PageVO {

    /** serialVersionUID */
    private static final long serialVersionUID = 269543851961066097L;
    /** 일련번호 */
    @Required
    @Digits
    private Integer sn;

    /** 도메인코드 */
    @Required
    private Integer domnCode;

    /** 도메인명 */
    private String domnNm;

    /** 도메인설명 */
    private String domnDc;

    /** 제목 */
    @Required
    @MaxLength(max = 500)
    private String sj;

    /** 목적 */
    @MaxLength(max = 4000)
    private String purps;

    /** 결과요약 */
    private String resultSumry;

    /** 상태 */
    @Required
    private String sttus;

    /** 공개여부 */
    @Required
    private String othbcAt;

    /** 응답수 */
    @Digits
    private Integer rspnsCo;

    /** 제한수 */
    @Required
    @Digits
    private Integer lmttCo;

    /** 중복여부 */
    @Required
    private String dplctAt;

    /** 설문중복확인방법 */
    @RequireFrom(fieldName = "dplctAt", fieldValue = "Y", fieldDesc = "중복여부")
    private String qustnrDplctCnfirmMth;

    /** 그룹수 */
    @Digits
    private Integer groupCo;

    /** 조회수 */
    @Digits
    private Integer rdcnt;

    /** 시작일시 */
    @Required
    private Date beginDt;

    /** 종료일시 */
    @Required
    private Date endDt;

    /** 시작일시 - 문자열 */
    @Required
    private String beginDtStr;

    /** 종료일시 - 문자열 */
    @Required
    private String endDtStr;

    /** 부서코드 */
    @MaxLength(max = 20)
    private String deptCode;

    /** 부서명 */
    private String deptNm;

    /** 배너여부 */
    @Required
    private String bannerAt;

    /** 파일순번 */
    @Digits
    private Integer fileSn;

    /** 등록자ID */
    @MaxLength(max = 30)
    private String registerId;

    /** 등록자명 */
    private String registerNm;

    /** 등록일시 */
    @Required
    private Date registDt;

    /** 수정자ID */
    @MaxLength(max = 30)
    private String updusrId;

    /** 수정자명 */
    private String updusrNm;

    /** 수정일시 */
    private Date updtDt;

    /** 시작상태 */
    private Integer statusBegin;

    /** 종료상태 */
    private Integer statusEnd;

    /** 설문참여가능여부 */
    private Boolean valid;

    /** 회원여부 */
    private Boolean user;

    /**
     * 일련번호 설정
     * 
     * @param sn을(를) Integer sn로 설정
     */
    public void setSn(Integer sn) {
        this.sn = sn;
    }

    /**
     * 일련번호 반환
     * 
     * @return Integer sn
     */
    public Integer getSn() {
        return sn;
    }

    /**
     * 도메인코드 설정
     * 
     * @param domnCode을(를) Integer domnCode로 설정
     */
    public void setDomnCode(Integer domnCode) {
        this.domnCode = domnCode;
    }

    /**
     * 도메인코드 반환
     * 
     * @return Integer domnCode
     */
    public Integer getDomnCode() {
        return domnCode;
    }

    /**
     * 도메인명 설정
     * 
     * @param domnNm을(를) String domnNm로 설정
     */
    public void setDomnNm(String domnNm) {
        this.domnNm = domnNm;
    }

    /**
     * 도메인명 반환
     * 
     * @return String domnNm
     */
    public String getDomnNm() {
        return domnNm;
    }

    /**
     * 도메인설명 반환
     * 
     * @return String domnDc
     */
    public String getDomnDc() {
        return domnDc;
    }

    /**
     * 도메인설명 설정
     * 
     * @param domnDc 을(를) String domnDc로 설정
     */
    public void setDomnDc(String domnDc) {
        this.domnDc = domnDc;
    }

    /**
     * 제목 설정
     * 
     * @param sj을(를) String sj로 설정
     */
    public void setSj(String sj) {
        this.sj = sj;
    }

    /**
     * 제목 반환
     * 
     * @return String sj
     */
    public String getSj() {
        return sj;
    }

    /**
     * 목적 설정
     * 
     * @param purps을(를) String purps로 설정
     */
    public void setPurps(String purps) {
        this.purps = purps;
    }

    /**
     * 목적 반환
     * 
     * @return String purps
     */
    public String getPurps() {
        return purps;
    }

    /**
     * 결과요약 설정
     * 
     * @param resultSumry을(를) String resultSumry로 설정
     */
    public void setResultSumry(String resultSumry) {
        this.resultSumry = resultSumry;
    }

    /**
     * 결과요약 반환
     * 
     * @return String resultSumry
     */
    public String getResultSumry() {
        return resultSumry;
    }

    /**
     * 상태 설정
     * 
     * @param sttus을(를) String sttus로 설정
     */
    public void setSttus(String sttus) {
        this.sttus = sttus;
    }

    /**
     * 상태 반환
     * 
     * @return String sttus
     */
    public String getSttus() {
        return sttus;
    }

    /**
     * 공개여부 설정
     * 
     * @param othbcAt을(를) String othbcAt로 설정
     */
    public void setOthbcAt(String othbcAt) {
        this.othbcAt = othbcAt;
    }

    /**
     * 공개여부 반환
     * 
     * @return String othbcAt
     */
    public String getOthbcAt() {
        return othbcAt;
    }

    /**
     * 응답수 설정
     * 
     * @param rspnsCo을(를) Integer rspnsCo로 설정
     */
    public void setRspnsCo(Integer rspnsCo) {
        this.rspnsCo = rspnsCo;
    }

    /**
     * 응답수 반환
     * 
     * @return Integer rspnsCo
     */
    public Integer getRspnsCo() {
        return rspnsCo;
    }

    /**
     * 제한수 설정
     * 
     * @param lmttCo을(를) Integer lmttCo로 설정
     */
    public void setLmttCo(Integer lmttCo) {
        this.lmttCo = lmttCo;
    }

    /**
     * 제한수 반환
     * 
     * @return Integer lmttCo
     */
    public Integer getLmttCo() {
        return lmttCo;
    }

    /**
     * 중복여부 설정
     * 
     * @param dplctAt을(를) String dplctAt로 설정
     */
    public void setDplctAt(String dplctAt) {
        this.dplctAt = dplctAt;
    }

    /**
     * 중복여부 반환
     * 
     * @return String dplctAt
     */
    public String getDplctAt() {
        return dplctAt;
    }

    /**
     * 설문중복확인방법 설정
     * 
     * @param qustnrDplctCnfirmMth을(를) String qustnrDplctCnfirmMth로 설정
     */
    public void setQustnrDplctCnfirmMth(String qustnrDplctCnfirmMth) {
        this.qustnrDplctCnfirmMth = qustnrDplctCnfirmMth;
    }

    /**
     * 설문중복확인방법 반환
     * 
     * @return String qustnrDplctCnfirmMth
     */
    public String getQustnrDplctCnfirmMth() {
        return qustnrDplctCnfirmMth;
    }

    /**
     * 그룹수 설정
     * 
     * @param groupCo을(를) Integer groupCo로 설정
     */
    public void setGroupCo(Integer groupCo) {
        this.groupCo = groupCo;
    }

    /**
     * 그룹수 반환
     * 
     * @return Integer groupCo
     */
    public Integer getGroupCo() {
        return groupCo;
    }

    /**
     * 조회수 설정
     * 
     * @param rdcnt을(를) Integer rdcnt로 설정
     */
    public void setRdcnt(Integer rdcnt) {
        this.rdcnt = rdcnt;
    }

    /**
     * 조회수 반환
     * 
     * @return Integer rdcnt
     */
    public Integer getRdcnt() {
        return rdcnt;
    }

    /**
     * 시작일시 설정
     * 
     * @param beginDt을(를) Date beginDt로 설정
     */
    public void setBeginDt(Date beginDt) {
        this.beginDt = beginDt;
    }

    /**
     * 시작일시 반환
     * 
     * @return Date beginDt
     */
    public Date getBeginDt() {
        return beginDt;
    }

    /**
     * 종료일시 설정
     * 
     * @param endDt을(를) Date endDt로 설정
     */
    public void setEndDt(Date endDt) {
        this.endDt = endDt;
    }

    /**
     * 종료일시 반환
     * 
     * @return Date endDt
     */
    public Date getEndDt() {
        return endDt;
    }

    /**
     * String beginDtStr을 반환
     * 
     * @return String beginDtStr
     */
    public String getBeginDtStr() {
        return beginDtStr;
    }

    /**
     * beginDtStr을 설정
     * 
     * @param beginDtStr 을(를) String beginDtStr로 설정
     */
    public void setBeginDtStr(String beginDtStr) {
        this.beginDtStr = beginDtStr;
    }

    /**
     * String endDtStr을 반환
     * 
     * @return String endDtStr
     */
    public String getEndDtStr() {
        return endDtStr;
    }

    /**
     * endDtStr을 설정
     * 
     * @param endDtStr 을(를) String endDtStr로 설정
     */
    public void setEndDtStr(String endDtStr) {
        this.endDtStr = endDtStr;
    }

    /**
     * 부서코드 설정
     * 
     * @param deptCode을(를) String deptCode로 설정
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * 부서코드 반환
     * 
     * @return String deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 부서명 설정
     * 
     * @param deptNm을(를) String deptNm로 설정
     */
    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm;
    }

    /**
     * 부서명 반환
     * 
     * @return String deptNm
     */
    public String getDeptNm() {
        return deptNm;
    }

    /**
     * 배너여부 설정
     * 
     * @param bannerAt을(를) String bannerAt로 설정
     */
    public void setBannerAt(String bannerAt) {
        this.bannerAt = bannerAt;
    }

    /**
     * 배너여부 반환
     * 
     * @return String bannerAt
     */
    public String getBannerAt() {
        return bannerAt;
    }

    /**
     * 파일순번 설정
     * 
     * @param fileSn을(를) Integer fileSn로 설정
     */
    public void setFileSn(Integer fileSn) {
        this.fileSn = fileSn;
    }

    /**
     * 파일순번 반환
     * 
     * @return Integer fileSn
     */
    public Integer getFileSn() {
        return fileSn;
    }

    /**
     * 등록자ID 설정
     * 
     * @param registerId을(를) String registerId로 설정
     */
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    /**
     * 등록자ID 반환
     * 
     * @return String registerId
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * 등록자명 설정
     * 
     * @param registerNm을(를) String registerNm로 설정
     */
    public void setRegisterNm(String registerNm) {
        this.registerNm = registerNm;
    }

    /**
     * 등록자명 반환
     * 
     * @return String registerNm
     */
    public String getRegisterNm() {
        return registerNm;
    }

    /**
     * 등록일시 설정
     * 
     * @param registDt을(를) Date registDt로 설정
     */
    public void setRegistDt(Date registDt) {
        this.registDt = registDt;
    }

    /**
     * 등록일시 반환
     * 
     * @return Date registDt
     */
    public Date getRegistDt() {
        return registDt;
    }

    /**
     * 수정자ID 설정
     * 
     * @param updusrId을(를) String updusrId로 설정
     */
    public void setUpdusrId(String updusrId) {
        this.updusrId = updusrId;
    }

    /**
     * 수정자ID 반환
     * 
     * @return String updusrId
     */
    public String getUpdusrId() {
        return updusrId;
    }

    /**
     * 수정자명 설정
     * 
     * @param updusrNm을(를) String updusrNm로 설정
     */
    public void setUpdusrNm(String updusrNm) {
        this.updusrNm = updusrNm;
    }

    /**
     * 수정자명 반환
     * 
     * @return String updusrNm
     */
    public String getUpdusrNm() {
        return updusrNm;
    }

    /**
     * 수정일시 설정
     * 
     * @param updtDt을(를) Date updtDt로 설정
     */
    public void setUpdtDt(Date updtDt) {
        this.updtDt = updtDt;
    }

    /**
     * 수정일시 반환
     * 
     * @return Date updtDt
     */
    public Date getUpdtDt() {
        return updtDt;
    }

    /**
     * 시작상태 반환
     * 
     * @return Integer statusBegin
     */
    public Integer getStatusBegin() {
        return statusBegin;
    }

    /**
     * 시작상태 설정
     * 
     * @param statusBegin 을(를) Integer statusBegin로 설정
     */
    public void setStatusBegin(Integer statusBegin) {
        this.statusBegin = statusBegin;
    }

    /**
     * 종료상태 반환
     * 
     * @return Integer statusEnd
     */
    public Integer getStatusEnd() {
        return statusEnd;
    }

    /**
     * 종료상태 설정
     * 
     * @param statusEnd 을(를) Integer statusEnd로 설정
     */
    public void setStatusEnd(Integer statusEnd) {
        this.statusEnd = statusEnd;
    }

    /**
     * Boolean valid을 반환
     * 
     * @return Boolean valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * valid을 설정
     * 
     * @param valid 을(를) Boolean valid로 설정
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * Boolean user을 반환
     * 
     * @return Boolean user
     */
    public Boolean getUser() {
        return user;
    }

    /**
     * user을 설정
     * 
     * @param user 을(를) Boolean user로 설정
     */
    public void setUser(Boolean user) {
        this.user = user;
    }

}
