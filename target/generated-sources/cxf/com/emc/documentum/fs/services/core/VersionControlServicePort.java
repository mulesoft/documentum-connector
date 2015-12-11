package com.emc.documentum.fs.services.core;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.15
 * 2015-12-11T17:08:21.536-03:00
 * Generated source version: 2.7.15
 * 
 */
@WebService(targetNamespace = "http://core.services.fs.documentum.emc.com/", name = "VersionControlServicePort")
@XmlSeeAlso({com.emc.documentum.fs.datamodel.core.profiles.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.content.ObjectFactory.class, com.emc.documentum.fs.rt.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.properties.ObjectFactory.class, com.emc.documentum.fs.datamodel.core.query.ObjectFactory.class, ObjectFactory.class})
public interface VersionControlServicePort {

    /**
     * Retrieves objects from the repository and returns them in the Data Package.  This operation will
     * walk the version tree and return the CURRENT object.  It will return the current version for the object pointed
     * by the object Identity regardless of its position in the version tree.
     * <p>
     * Note: If it is necessary to retrieve objects by Label, version, etc please use QueryService.
     * 
     * @param forObjects  A collection of ObjectIdentity instances that uniquely identify the repository objects of
     *                    which the CURRENT version will be exported.
     * @param options     An object containing profiles and properties that specify operation behaviors. If this object
     *                    is null, default operation behaviors will take effect.
     *                    OperationOptions can contain PropertyProfile, ContentProfile, PermissionProfile,
     *                    RelationshipProfile that will be used to populate the returned DataPackage. Also it can
     *                    contain ContentTransferProfile to specify the specifics of content transfer.
     * @return resulting DataObject. By default, it will return DataObject with all content. PropertyProfile
     *         and ContentProfile settings can be used to specify what data is populated.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     */
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCurrent", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetCurrent")
    @WebMethod
    @ResponseWrapper(localName = "getCurrentResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetCurrentResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage getCurrent(
        @WebParam(name = "forObjects", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet forObjects,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;

    /**
     * Provides information about a version of a repository object.
     * 
     * @param objectIdentitySet A collection of ObjectIdentity instances that uniquely identify the repository objects
     *                          about which to provide version information.
     * @return Returns a List of VersionInfo instances corresponding to the DataObject instances in the ObjectIdentitySet.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     */
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getVersionInfo", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetVersionInfo")
    @WebMethod
    @ResponseWrapper(localName = "getVersionInfoResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetVersionInfoResponse")
    public java.util.List<com.emc.documentum.fs.datamodel.core.VersionInfo> getVersionInfo(
        @WebParam(name = "objectIdentitySet", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet objectIdentitySet
    ) throws SerializableException;

    /**
     * Performs cancel checkout for the specified objects.
     * 
     * @param objectIdentitySet A collection of ObjectIdentity instances that uniquely identify the repository objects
     *                          to check out.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     */
    @RequestWrapper(localName = "cancelCheckout", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CancelCheckout")
    @WebMethod
    @ResponseWrapper(localName = "cancelCheckoutResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CancelCheckoutResponse")
    public void cancelCheckout(
        @WebParam(name = "objectIdentitySet", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet objectIdentitySet
    ) throws SerializableException;

    /**
     * Deletes a specific version of a repository object. If the deleted object is the CURRENT version, the previous
     * version in the version tree is promoted to CURRENT.
     * 
     * @param objectsToDelete A collection of ObjectIdentity instances that uniquely identify the repository object
     *                        versions to delete.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     */
    @RequestWrapper(localName = "deleteVersion", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.DeleteVersion")
    @WebMethod
    @ResponseWrapper(localName = "deleteVersionResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.DeleteVersionResponse")
    public void deleteVersion(
        @WebParam(name = "objectsToDelete", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet objectsToDelete
    ) throws SerializableException;

    /**
     * Deletes all versions of a repository object. An ObjectIdentity indicating the object to delete can reference any
     * version in the version tree.
     * 
     * @param objectIdentitySet A collection of ObjectIdentity instances that uniquely identify the repository objects
     *                          of which to delete all versions.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     */
    @RequestWrapper(localName = "deleteAllVersions", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.DeleteAllVersions")
    @WebMethod
    @ResponseWrapper(localName = "deleteAllVersionsResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.DeleteAllVersionsResponse")
    public void deleteAllVersions(
        @WebParam(name = "objectIdentitySet", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet objectIdentitySet
    ) throws SerializableException;

    /**
     * Provides checkout information about the specified objects, specifically whether the objects are checked out, and
     * the user name of the user who has them checked out.
     * 
     * @param objectIdentitySet  A collection of ObjectIdentity instances that uniquely identify the repository objects
     *                           about which to obtain checkout information.
     * @return Returns a List of CheckoutInfo instances. Checkout info encapsulates data about a specific checked out
     *         repository object.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     */
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCheckoutInfo", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetCheckoutInfo")
    @WebMethod
    @ResponseWrapper(localName = "getCheckoutInfoResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.GetCheckoutInfoResponse")
    public java.util.List<com.emc.documentum.fs.datamodel.core.CheckoutInfo> getCheckoutInfo(
        @WebParam(name = "objectIdentitySet", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet objectIdentitySet
    ) throws SerializableException;

    /**
     * Performs checkout operation for a set of repository objects. Any version of the object can be checked out.
     * 
     * @param objectIdentitySet A collection of ObjectIdentity instances that uniquely identify the repository objects
     *                          to check out.
     * @param options     An object containing profiles and properties that specify operation behaviors. If this object
     *                    is null, default operation behaviors will take effect.
     *                    It can contain CheckoutProfile that will modify the behaviour of the operation. 
     *                    OperationOptions can contain PropertyProfile, ContentProfile, PermissionProfile,
     *                    RelationshipProfile that will be used to populate the returned DataPackage. Also it can
     *                    contain ContentTransferProfile to specify the specifics of content transfer.
     * @return resulting DataObject. By default, it will return DataObject with all content. PropertyProfile
     *         and ContentProfile settings can be used to specify what data is populated.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     */
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "checkout", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Checkout")
    @WebMethod
    @ResponseWrapper(localName = "checkoutResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CheckoutResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage checkout(
        @WebParam(name = "objectIdentitySet", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.ObjectIdentitySet objectIdentitySet,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;

    /**
     * Checks in a set of repository objects using data contained in a DataPackage. It provides control over how the
     * checked in object is versioned and whether the object remains checked out and locked by the user after the
     * changes are versioned, and provides a mechanism for applying symbolic version labels to the checkedâ€‘in versions.
     * The ObjectIdentity of each DataObject passed to the operation is expected to match the identity of a checked out
     * repository object.<p>
     * 
     * @param dataPackage Contains a set of DataObject instances that are to be checked in as new versions of checked
     *                    out repository objects.
     * @param versionStrategy Specifies option for incrementing the version number of the new version.
     * @param isRetainLock    Specifies whether the object is to remain checked out and locked by the user after the new
     *                        version is saved.
     * @param symbolicLabels  optional parameter that allows to set custom version labels for the objects.
     * @param options     An object containing profiles and properties that specify operation behaviors. If this object
     *                    is null, default operation behaviors will take effect.
     *                    It can contain CheckinProfile that will modify the behaviour of the operation.
     *                    OperationOptions can also contain PropertyProfile, ContentProfile, PermissionProfile,
     *                    RelationshipProfile that will be used to populate the returned DataPackage. Also it can
     *                    contain ContentTransferProfile to specify the specifics of content transfer.
     * @return resulting DataPackage. By default, it will only return ObjectIdentity filled in for each DataObject.
     * @throws com.emc.documentum.fs.services.core.CoreServiceException
     * 
     * @see com.emc.documentum.fs.datamodel.core.profiles.CheckinProfile
     */
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "checkin", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.Checkin")
    @WebMethod
    @ResponseWrapper(localName = "checkinResponse", targetNamespace = "http://core.services.fs.documentum.emc.com/", className = "com.emc.documentum.fs.services.core.CheckinResponse")
    public com.emc.documentum.fs.datamodel.core.DataPackage checkin(
        @WebParam(name = "dataPackage", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.DataPackage dataPackage,
        @WebParam(name = "versionStrategy", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.VersionStrategy versionStrategy,
        @WebParam(name = "isRetainLock", targetNamespace = "")
        boolean isRetainLock,
        @WebParam(name = "symbolicLabels", targetNamespace = "")
        java.util.List<java.lang.String> symbolicLabels,
        @WebParam(name = "options", targetNamespace = "")
        com.emc.documentum.fs.datamodel.core.OperationOptions options
    ) throws SerializableException;
}
