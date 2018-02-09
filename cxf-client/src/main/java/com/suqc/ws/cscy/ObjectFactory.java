
package com.suqc.ws.cscy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.suqc.ws.cscy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetReportIdResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getReportIdResponse");
    private final static QName _ToLoginResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "toLoginResponse");
    private final static QName _GetApplyDetail_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getApplyDetail");
    private final static QName _Exception_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "Exception");
    private final static QName _GetApplyResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getApplyResponse");
    private final static QName _GetApplyDetailResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getApplyDetailResponse");
    private final static QName _GetCommListResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getCommListResponse");
    private final static QName _SendApplyResultResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "sendApplyResultResponse");
    private final static QName _Getpdf_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getpdf");
    private final static QName _UpdateApplyStatus_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "updateApplyStatus");
    private final static QName _UpdateApplyStatusResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "updateApplyStatusResponse");
    private final static QName _SendApplyResult_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "sendApplyResult");
    private final static QName _GetCommList_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getCommList");
    private final static QName _GetpdfResponse_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getpdfResponse");
    private final static QName _ToLogin_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "toLogin");
    private final static QName _GetReportId_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getReportId");
    private final static QName _GetApply_QNAME = new QName("http://service.cscy.webservice.kspace.cnki.org/", "getApply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.suqc.ws.cscy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetApplyResponse }
     * 
     */
    public GetApplyResponse createGetApplyResponse() {
        return new GetApplyResponse();
    }

    /**
     * Create an instance of {@link GetApplyDetailResponse }
     * 
     */
    public GetApplyDetailResponse createGetApplyDetailResponse() {
        return new GetApplyDetailResponse();
    }

    /**
     * Create an instance of {@link GetCommListResponse }
     * 
     */
    public GetCommListResponse createGetCommListResponse() {
        return new GetCommListResponse();
    }

    /**
     * Create an instance of {@link GetReportIdResponse }
     * 
     */
    public GetReportIdResponse createGetReportIdResponse() {
        return new GetReportIdResponse();
    }

    /**
     * Create an instance of {@link ToLoginResponse }
     * 
     */
    public ToLoginResponse createToLoginResponse() {
        return new ToLoginResponse();
    }

    /**
     * Create an instance of {@link GetApplyDetail }
     * 
     */
    public GetApplyDetail createGetApplyDetail() {
        return new GetApplyDetail();
    }

    /**
     * Create an instance of {@link UpdateApplyStatusResponse }
     * 
     */
    public UpdateApplyStatusResponse createUpdateApplyStatusResponse() {
        return new UpdateApplyStatusResponse();
    }

    /**
     * Create an instance of {@link SendApplyResult }
     * 
     */
    public SendApplyResult createSendApplyResult() {
        return new SendApplyResult();
    }

    /**
     * Create an instance of {@link GetCommList }
     * 
     */
    public GetCommList createGetCommList() {
        return new GetCommList();
    }

    /**
     * Create an instance of {@link GetpdfResponse }
     * 
     */
    public GetpdfResponse createGetpdfResponse() {
        return new GetpdfResponse();
    }

    /**
     * Create an instance of {@link ToLogin }
     * 
     */
    public ToLogin createToLogin() {
        return new ToLogin();
    }

    /**
     * Create an instance of {@link GetReportId }
     * 
     */
    public GetReportId createGetReportId() {
        return new GetReportId();
    }

    /**
     * Create an instance of {@link GetApply }
     * 
     */
    public GetApply createGetApply() {
        return new GetApply();
    }

    /**
     * Create an instance of {@link UpdateApplyStatus }
     * 
     */
    public UpdateApplyStatus createUpdateApplyStatus() {
        return new UpdateApplyStatus();
    }

    /**
     * Create an instance of {@link Getpdf }
     * 
     */
    public Getpdf createGetpdf() {
        return new Getpdf();
    }

    /**
     * Create an instance of {@link SendApplyResultResponse }
     * 
     */
    public SendApplyResultResponse createSendApplyResultResponse() {
        return new SendApplyResultResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getReportIdResponse")
    public JAXBElement<GetReportIdResponse> createGetReportIdResponse(GetReportIdResponse value) {
        return new JAXBElement<GetReportIdResponse>(_GetReportIdResponse_QNAME, GetReportIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "toLoginResponse")
    public JAXBElement<ToLoginResponse> createToLoginResponse(ToLoginResponse value) {
        return new JAXBElement<ToLoginResponse>(_ToLoginResponse_QNAME, ToLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getApplyDetail")
    public JAXBElement<GetApplyDetail> createGetApplyDetail(GetApplyDetail value) {
        return new JAXBElement<GetApplyDetail>(_GetApplyDetail_QNAME, GetApplyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getApplyResponse")
    public JAXBElement<GetApplyResponse> createGetApplyResponse(GetApplyResponse value) {
        return new JAXBElement<GetApplyResponse>(_GetApplyResponse_QNAME, GetApplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplyDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getApplyDetailResponse")
    public JAXBElement<GetApplyDetailResponse> createGetApplyDetailResponse(GetApplyDetailResponse value) {
        return new JAXBElement<GetApplyDetailResponse>(_GetApplyDetailResponse_QNAME, GetApplyDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getCommListResponse")
    public JAXBElement<GetCommListResponse> createGetCommListResponse(GetCommListResponse value) {
        return new JAXBElement<GetCommListResponse>(_GetCommListResponse_QNAME, GetCommListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendApplyResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "sendApplyResultResponse")
    public JAXBElement<SendApplyResultResponse> createSendApplyResultResponse(SendApplyResultResponse value) {
        return new JAXBElement<SendApplyResultResponse>(_SendApplyResultResponse_QNAME, SendApplyResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getpdf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getpdf")
    public JAXBElement<Getpdf> createGetpdf(Getpdf value) {
        return new JAXBElement<Getpdf>(_Getpdf_QNAME, Getpdf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateApplyStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "updateApplyStatus")
    public JAXBElement<UpdateApplyStatus> createUpdateApplyStatus(UpdateApplyStatus value) {
        return new JAXBElement<UpdateApplyStatus>(_UpdateApplyStatus_QNAME, UpdateApplyStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateApplyStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "updateApplyStatusResponse")
    public JAXBElement<UpdateApplyStatusResponse> createUpdateApplyStatusResponse(UpdateApplyStatusResponse value) {
        return new JAXBElement<UpdateApplyStatusResponse>(_UpdateApplyStatusResponse_QNAME, UpdateApplyStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendApplyResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "sendApplyResult")
    public JAXBElement<SendApplyResult> createSendApplyResult(SendApplyResult value) {
        return new JAXBElement<SendApplyResult>(_SendApplyResult_QNAME, SendApplyResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getCommList")
    public JAXBElement<GetCommList> createGetCommList(GetCommList value) {
        return new JAXBElement<GetCommList>(_GetCommList_QNAME, GetCommList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetpdfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getpdfResponse")
    public JAXBElement<GetpdfResponse> createGetpdfResponse(GetpdfResponse value) {
        return new JAXBElement<GetpdfResponse>(_GetpdfResponse_QNAME, GetpdfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "toLogin")
    public JAXBElement<ToLogin> createToLogin(ToLogin value) {
        return new JAXBElement<ToLogin>(_ToLogin_QNAME, ToLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getReportId")
    public JAXBElement<GetReportId> createGetReportId(GetReportId value) {
        return new JAXBElement<GetReportId>(_GetReportId_QNAME, GetReportId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cscy.webservice.kspace.cnki.org/", name = "getApply")
    public JAXBElement<GetApply> createGetApply(GetApply value) {
        return new JAXBElement<GetApply>(_GetApply_QNAME, GetApply.class, null, value);
    }

}
