/**
 * MySQLServiceEquipmentCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package org.apache.ws.axis2;


/**
 *  MySQLServiceEquipmentCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class MySQLServiceEquipmentCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public MySQLServiceEquipmentCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public MySQLServiceEquipmentCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for addResponsible method
     * override this method for handling normal response from addResponsible operation
     */
    public void receiveResultaddResponsible(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.AddResponsibleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addResponsible operation
     */
    public void receiveErroraddResponsible(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCabinet method
     * override this method for handling normal response from getCabinet operation
     */
    public void receiveResultgetCabinet(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetCabinetResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCabinet operation
     */
    public void receiveErrorgetCabinet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getResponsible method
     * override this method for handling normal response from getResponsible operation
     */
    public void receiveResultgetResponsible(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetResponsibleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getResponsible operation
     */
    public void receiveErrorgetResponsible(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for editResponsible method
     * override this method for handling normal response from editResponsible operation
     */
    public void receiveResulteditResponsible(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.EditResponsibleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from editResponsible operation
     */
    public void receiveErroreditResponsible(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for delEquipment method
     * override this method for handling normal response from delEquipment operation
     */
    public void receiveResultdelEquipment(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.DelEquipmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from delEquipment operation
     */
    public void receiveErrordelEquipment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addCabinet method
     * override this method for handling normal response from addCabinet operation
     */
    public void receiveResultaddCabinet(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.AddCabinetResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addCabinet operation
     */
    public void receiveErroraddCabinet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMySpechialCode method
     * override this method for handling normal response from getMySpechialCode operation
     */
    public void receiveResultgetMySpechialCode(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetMySpechialCodeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMySpechialCode operation
     */
    public void receiveErrorgetMySpechialCode(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for delResponsible method
     * override this method for handling normal response from delResponsible operation
     */
    public void receiveResultdelResponsible(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.DelResponsibleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from delResponsible operation
     */
    public void receiveErrordelResponsible(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for delDistribution method
     * override this method for handling normal response from delDistribution operation
     */
    public void receiveResultdelDistribution(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.DelDistributionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from delDistribution operation
     */
    public void receiveErrordelDistribution(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for editWriteoff method
     * override this method for handling normal response from editWriteoff operation
     */
    public void receiveResulteditWriteoff(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.EditWriteoffResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from editWriteoff operation
     */
    public void receiveErroreditWriteoff(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for editDistribution method
     * override this method for handling normal response from editDistribution operation
     */
    public void receiveResulteditDistribution(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.EditDistributionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from editDistribution operation
     */
    public void receiveErroreditDistribution(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addEquipment method
     * override this method for handling normal response from addEquipment operation
     */
    public void receiveResultaddEquipment(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.AddEquipmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addEquipment operation
     */
    public void receiveErroraddEquipment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for delWriteoff method
     * override this method for handling normal response from delWriteoff operation
     */
    public void receiveResultdelWriteoff(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.DelWriteoffResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from delWriteoff operation
     */
    public void receiveErrordelWriteoff(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for delCabinet method
     * override this method for handling normal response from delCabinet operation
     */
    public void receiveResultdelCabinet(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.DelCabinetResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from delCabinet operation
     */
    public void receiveErrordelCabinet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDistribution method
     * override this method for handling normal response from getDistribution operation
     */
    public void receiveResultgetDistribution(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetDistributionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDistribution operation
     */
    public void receiveErrorgetDistribution(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for editEquipment method
     * override this method for handling normal response from editEquipment operation
     */
    public void receiveResulteditEquipment(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.EditEquipmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from editEquipment operation
     */
    public void receiveErroreditEquipment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addWriteoff method
     * override this method for handling normal response from addWriteoff operation
     */
    public void receiveResultaddWriteoff(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.AddWriteoffResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addWriteoff operation
     */
    public void receiveErroraddWriteoff(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getWriteoff method
     * override this method for handling normal response from getWriteoff operation
     */
    public void receiveResultgetWriteoff(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetWriteoffResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getWriteoff operation
     */
    public void receiveErrorgetWriteoff(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getEquipment method
     * override this method for handling normal response from getEquipment operation
     */
    public void receiveResultgetEquipment(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetEquipmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getEquipment operation
     */
    public void receiveErrorgetEquipment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addDistribution method
     * override this method for handling normal response from addDistribution operation
     */
    public void receiveResultaddDistribution(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.AddDistributionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addDistribution operation
     */
    public void receiveErroraddDistribution(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for editCabinet method
     * override this method for handling normal response from editCabinet operation
     */
    public void receiveResulteditCabinet(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.EditCabinetResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from editCabinet operation
     */
    public void receiveErroreditCabinet(java.lang.Exception e) {
    }
}
