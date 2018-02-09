
package com.suqc.ws.kspace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.suqc.ws.kspace package. 
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

    private final static QName _Exception_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "Exception");
    private final static QName _ImportFullText_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "importFullText");
    private final static QName _GetEPersonDicts_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getEPersonDicts");
    private final static QName _GetEPersonDictsResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getEPersonDictsResponse");
    private final static QName _GetCommDicts_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getCommDicts");
    private final static QName _LoginResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "loginResponse");
    private final static QName _ExportAllItemResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "exportAllItemResponse");
    private final static QName _GetSystemDictsResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getSystemDictsResponse");
    private final static QName _GetContentType_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getContentType");
    private final static QName _BatchImport_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "batchImport");
    private final static QName _GetComms_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getComms");
    private final static QName _ExportAllItem_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "exportAllItem");
    private final static QName _ExportItemResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "exportItemResponse");
    private final static QName _GetFullTextPath_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getFullTextPath");
    private final static QName _GetEPersons_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getEPersons");
    private final static QName _CheckFullTextRepeatResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "checkFullTextRepeatResponse");
    private final static QName _GetCommDictsResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getCommDictsResponse");
    private final static QName _GetSystemDicts_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getSystemDicts");
    private final static QName _Login_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "login");
    private final static QName _CheckRepeatResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "checkRepeatResponse");
    private final static QName _GetTemplateByCtypeResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getTemplateByCtypeResponse");
    private final static QName _CheckRepeat_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "checkRepeat");
    private final static QName _GetTemplateByCtype_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getTemplateByCtype");
    private final static QName _GetContentTypeResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getContentTypeResponse");
    private final static QName _ImportFullTextResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "importFullTextResponse");
    private final static QName _ExportItem_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "exportItem");
    private final static QName _GetCommsResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getCommsResponse");
    private final static QName _GetEPersonsResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getEPersonsResponse");
    private final static QName _CheckFullTextRepeat_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "checkFullTextRepeat");
    private final static QName _GetFullTextPathResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "getFullTextPathResponse");
    private final static QName _BatchImportResponse_QNAME = new QName("http://service.iutil.kspace.cnki.org/", "batchImportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.suqc.ws.kspace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContentTypeResponse }
     * 
     */
    public GetContentTypeResponse createGetContentTypeResponse() {
        return new GetContentTypeResponse();
    }

    /**
     * Create an instance of {@link GetTemplateByCtype }
     * 
     */
    public GetTemplateByCtype createGetTemplateByCtype() {
        return new GetTemplateByCtype();
    }

    /**
     * Create an instance of {@link CheckRepeat }
     * 
     */
    public CheckRepeat createCheckRepeat() {
        return new CheckRepeat();
    }

    /**
     * Create an instance of {@link CheckRepeatResponse }
     * 
     */
    public CheckRepeatResponse createCheckRepeatResponse() {
        return new CheckRepeatResponse();
    }

    /**
     * Create an instance of {@link GetTemplateByCtypeResponse }
     * 
     */
    public GetTemplateByCtypeResponse createGetTemplateByCtypeResponse() {
        return new GetTemplateByCtypeResponse();
    }

    /**
     * Create an instance of {@link GetSystemDicts }
     * 
     */
    public GetSystemDicts createGetSystemDicts() {
        return new GetSystemDicts();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link CheckFullTextRepeatResponse }
     * 
     */
    public CheckFullTextRepeatResponse createCheckFullTextRepeatResponse() {
        return new CheckFullTextRepeatResponse();
    }

    /**
     * Create an instance of {@link GetCommDictsResponse }
     * 
     */
    public GetCommDictsResponse createGetCommDictsResponse() {
        return new GetCommDictsResponse();
    }

    /**
     * Create an instance of {@link ExportItem }
     * 
     */
    public ExportItem createExportItem() {
        return new ExportItem();
    }

    /**
     * Create an instance of {@link GetCommsResponse }
     * 
     */
    public GetCommsResponse createGetCommsResponse() {
        return new GetCommsResponse();
    }

    /**
     * Create an instance of {@link GetEPersonsResponse }
     * 
     */
    public GetEPersonsResponse createGetEPersonsResponse() {
        return new GetEPersonsResponse();
    }

    /**
     * Create an instance of {@link BatchImportResponse }
     * 
     */
    public BatchImportResponse createBatchImportResponse() {
        return new BatchImportResponse();
    }

    /**
     * Create an instance of {@link CheckFullTextRepeat }
     * 
     */
    public CheckFullTextRepeat createCheckFullTextRepeat() {
        return new CheckFullTextRepeat();
    }

    /**
     * Create an instance of {@link GetFullTextPathResponse }
     * 
     */
    public GetFullTextPathResponse createGetFullTextPathResponse() {
        return new GetFullTextPathResponse();
    }

    /**
     * Create an instance of {@link ImportFullTextResponse }
     * 
     */
    public ImportFullTextResponse createImportFullTextResponse() {
        return new ImportFullTextResponse();
    }

    /**
     * Create an instance of {@link ExportAllItemResponse }
     * 
     */
    public ExportAllItemResponse createExportAllItemResponse() {
        return new ExportAllItemResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetEPersonDictsResponse }
     * 
     */
    public GetEPersonDictsResponse createGetEPersonDictsResponse() {
        return new GetEPersonDictsResponse();
    }

    /**
     * Create an instance of {@link GetCommDicts }
     * 
     */
    public GetCommDicts createGetCommDicts() {
        return new GetCommDicts();
    }

    /**
     * Create an instance of {@link GetEPersonDicts }
     * 
     */
    public GetEPersonDicts createGetEPersonDicts() {
        return new GetEPersonDicts();
    }

    /**
     * Create an instance of {@link ImportFullText }
     * 
     */
    public ImportFullText createImportFullText() {
        return new ImportFullText();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ExportAllItem }
     * 
     */
    public ExportAllItem createExportAllItem() {
        return new ExportAllItem();
    }

    /**
     * Create an instance of {@link ExportItemResponse }
     * 
     */
    public ExportItemResponse createExportItemResponse() {
        return new ExportItemResponse();
    }

    /**
     * Create an instance of {@link GetComms }
     * 
     */
    public GetComms createGetComms() {
        return new GetComms();
    }

    /**
     * Create an instance of {@link GetEPersons }
     * 
     */
    public GetEPersons createGetEPersons() {
        return new GetEPersons();
    }

    /**
     * Create an instance of {@link GetFullTextPath }
     * 
     */
    public GetFullTextPath createGetFullTextPath() {
        return new GetFullTextPath();
    }

    /**
     * Create an instance of {@link GetContentType }
     * 
     */
    public GetContentType createGetContentType() {
        return new GetContentType();
    }

    /**
     * Create an instance of {@link BatchImport }
     * 
     */
    public BatchImport createBatchImport() {
        return new BatchImport();
    }

    /**
     * Create an instance of {@link GetSystemDictsResponse }
     * 
     */
    public GetSystemDictsResponse createGetSystemDictsResponse() {
        return new GetSystemDictsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportFullText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "importFullText")
    public JAXBElement<ImportFullText> createImportFullText(ImportFullText value) {
        return new JAXBElement<ImportFullText>(_ImportFullText_QNAME, ImportFullText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEPersonDicts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getEPersonDicts")
    public JAXBElement<GetEPersonDicts> createGetEPersonDicts(GetEPersonDicts value) {
        return new JAXBElement<GetEPersonDicts>(_GetEPersonDicts_QNAME, GetEPersonDicts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEPersonDictsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getEPersonDictsResponse")
    public JAXBElement<GetEPersonDictsResponse> createGetEPersonDictsResponse(GetEPersonDictsResponse value) {
        return new JAXBElement<GetEPersonDictsResponse>(_GetEPersonDictsResponse_QNAME, GetEPersonDictsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommDicts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getCommDicts")
    public JAXBElement<GetCommDicts> createGetCommDicts(GetCommDicts value) {
        return new JAXBElement<GetCommDicts>(_GetCommDicts_QNAME, GetCommDicts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportAllItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "exportAllItemResponse")
    public JAXBElement<ExportAllItemResponse> createExportAllItemResponse(ExportAllItemResponse value) {
        return new JAXBElement<ExportAllItemResponse>(_ExportAllItemResponse_QNAME, ExportAllItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemDictsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getSystemDictsResponse")
    public JAXBElement<GetSystemDictsResponse> createGetSystemDictsResponse(GetSystemDictsResponse value) {
        return new JAXBElement<GetSystemDictsResponse>(_GetSystemDictsResponse_QNAME, GetSystemDictsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getContentType")
    public JAXBElement<GetContentType> createGetContentType(GetContentType value) {
        return new JAXBElement<GetContentType>(_GetContentType_QNAME, GetContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchImport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "batchImport")
    public JAXBElement<BatchImport> createBatchImport(BatchImport value) {
        return new JAXBElement<BatchImport>(_BatchImport_QNAME, BatchImport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getComms")
    public JAXBElement<GetComms> createGetComms(GetComms value) {
        return new JAXBElement<GetComms>(_GetComms_QNAME, GetComms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportAllItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "exportAllItem")
    public JAXBElement<ExportAllItem> createExportAllItem(ExportAllItem value) {
        return new JAXBElement<ExportAllItem>(_ExportAllItem_QNAME, ExportAllItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "exportItemResponse")
    public JAXBElement<ExportItemResponse> createExportItemResponse(ExportItemResponse value) {
        return new JAXBElement<ExportItemResponse>(_ExportItemResponse_QNAME, ExportItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullTextPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getFullTextPath")
    public JAXBElement<GetFullTextPath> createGetFullTextPath(GetFullTextPath value) {
        return new JAXBElement<GetFullTextPath>(_GetFullTextPath_QNAME, GetFullTextPath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getEPersons")
    public JAXBElement<GetEPersons> createGetEPersons(GetEPersons value) {
        return new JAXBElement<GetEPersons>(_GetEPersons_QNAME, GetEPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckFullTextRepeatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "checkFullTextRepeatResponse")
    public JAXBElement<CheckFullTextRepeatResponse> createCheckFullTextRepeatResponse(CheckFullTextRepeatResponse value) {
        return new JAXBElement<CheckFullTextRepeatResponse>(_CheckFullTextRepeatResponse_QNAME, CheckFullTextRepeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommDictsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getCommDictsResponse")
    public JAXBElement<GetCommDictsResponse> createGetCommDictsResponse(GetCommDictsResponse value) {
        return new JAXBElement<GetCommDictsResponse>(_GetCommDictsResponse_QNAME, GetCommDictsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemDicts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getSystemDicts")
    public JAXBElement<GetSystemDicts> createGetSystemDicts(GetSystemDicts value) {
        return new JAXBElement<GetSystemDicts>(_GetSystemDicts_QNAME, GetSystemDicts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRepeatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "checkRepeatResponse")
    public JAXBElement<CheckRepeatResponse> createCheckRepeatResponse(CheckRepeatResponse value) {
        return new JAXBElement<CheckRepeatResponse>(_CheckRepeatResponse_QNAME, CheckRepeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateByCtypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getTemplateByCtypeResponse")
    public JAXBElement<GetTemplateByCtypeResponse> createGetTemplateByCtypeResponse(GetTemplateByCtypeResponse value) {
        return new JAXBElement<GetTemplateByCtypeResponse>(_GetTemplateByCtypeResponse_QNAME, GetTemplateByCtypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRepeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "checkRepeat")
    public JAXBElement<CheckRepeat> createCheckRepeat(CheckRepeat value) {
        return new JAXBElement<CheckRepeat>(_CheckRepeat_QNAME, CheckRepeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateByCtype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getTemplateByCtype")
    public JAXBElement<GetTemplateByCtype> createGetTemplateByCtype(GetTemplateByCtype value) {
        return new JAXBElement<GetTemplateByCtype>(_GetTemplateByCtype_QNAME, GetTemplateByCtype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getContentTypeResponse")
    public JAXBElement<GetContentTypeResponse> createGetContentTypeResponse(GetContentTypeResponse value) {
        return new JAXBElement<GetContentTypeResponse>(_GetContentTypeResponse_QNAME, GetContentTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportFullTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "importFullTextResponse")
    public JAXBElement<ImportFullTextResponse> createImportFullTextResponse(ImportFullTextResponse value) {
        return new JAXBElement<ImportFullTextResponse>(_ImportFullTextResponse_QNAME, ImportFullTextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "exportItem")
    public JAXBElement<ExportItem> createExportItem(ExportItem value) {
        return new JAXBElement<ExportItem>(_ExportItem_QNAME, ExportItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getCommsResponse")
    public JAXBElement<GetCommsResponse> createGetCommsResponse(GetCommsResponse value) {
        return new JAXBElement<GetCommsResponse>(_GetCommsResponse_QNAME, GetCommsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getEPersonsResponse")
    public JAXBElement<GetEPersonsResponse> createGetEPersonsResponse(GetEPersonsResponse value) {
        return new JAXBElement<GetEPersonsResponse>(_GetEPersonsResponse_QNAME, GetEPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckFullTextRepeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "checkFullTextRepeat")
    public JAXBElement<CheckFullTextRepeat> createCheckFullTextRepeat(CheckFullTextRepeat value) {
        return new JAXBElement<CheckFullTextRepeat>(_CheckFullTextRepeat_QNAME, CheckFullTextRepeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullTextPathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "getFullTextPathResponse")
    public JAXBElement<GetFullTextPathResponse> createGetFullTextPathResponse(GetFullTextPathResponse value) {
        return new JAXBElement<GetFullTextPathResponse>(_GetFullTextPathResponse_QNAME, GetFullTextPathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchImportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.iutil.kspace.cnki.org/", name = "batchImportResponse")
    public JAXBElement<BatchImportResponse> createBatchImportResponse(BatchImportResponse value) {
        return new JAXBElement<BatchImportResponse>(_BatchImportResponse_QNAME, BatchImportResponse.class, null, value);
    }

}
