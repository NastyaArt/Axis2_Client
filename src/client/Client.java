package client;

import java.util.Arrays;
import org.apache.ws.axis2.MySQLServiceEquipmentStub;
import org.apache.ws.axis2.MySQLServiceEquipmentStub.*;
import java.util.List;
import java.util.ArrayList;

public class Client {

    private final static String END_POINT = "http://localhost:1997/axis2/services/MySQLServiceEquipment?wsdl";
    private MySQLServiceEquipmentStub stub;

    public void connect(){
        try {
            stub = new MySQLServiceEquipmentStub(END_POINT);
        } catch (Exception x) {
            x.printStackTrace();
        }
        System.out.println("Connection open");
    }

    public List<Equipment> getEquipment()
    {
        List<Equipment> list = new ArrayList<Equipment>();
        try{
            MySQLServiceEquipmentStub.GetEquipment equipmentOperation = new MySQLServiceEquipmentStub.GetEquipment();
            MySQLServiceEquipmentStub.GetEquipmentResponse response = stub.getEquipment(equipmentOperation);
            MySQLServiceEquipmentStub.Equipment[] returnedEquipment = response.get_return();
            list = Arrays.asList(returnedEquipment);
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Cabinet> getCabinet()
    {
        List<Cabinet> list = new ArrayList<Cabinet>();
        try{
            MySQLServiceEquipmentStub.GetCabinet cabinetOperation = new MySQLServiceEquipmentStub.GetCabinet();
            MySQLServiceEquipmentStub.GetCabinetResponse response1 = stub.getCabinet(cabinetOperation);
            MySQLServiceEquipmentStub.Cabinet[] returnedCabinet = response1.get_return();
            list = Arrays.asList(returnedCabinet);
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Responsible> getResponsible()
    {
        List<Responsible> list = new ArrayList<Responsible>();
        try{
            MySQLServiceEquipmentStub.GetResponsible responsibleOperation = new MySQLServiceEquipmentStub.GetResponsible();
            MySQLServiceEquipmentStub.GetResponsibleResponse response2 = stub.getResponsible(responsibleOperation);
            MySQLServiceEquipmentStub.Responsible[] returnedResponsible = response2.get_return();
            list = Arrays.asList(returnedResponsible);
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Distribution> getDistribution()
    {
        List<Distribution> list = new ArrayList<Distribution>();
        try{
            MySQLServiceEquipmentStub.GetDistribution distributionOperation = new MySQLServiceEquipmentStub.GetDistribution();
            MySQLServiceEquipmentStub.GetDistributionResponse response3 = stub.getDistribution(distributionOperation);
            MySQLServiceEquipmentStub.Distribution[] returnedDistribution = response3.get_return();
            list = Arrays.asList(returnedDistribution);
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Writeoff> getWriteoff()
    {
        List<Writeoff> list = new ArrayList<Writeoff>();
        try{
            MySQLServiceEquipmentStub.GetWriteoff writeoffOperation = new MySQLServiceEquipmentStub.GetWriteoff();
            MySQLServiceEquipmentStub.GetWriteoffResponse response4 = stub.getWriteoff(writeoffOperation);
            MySQLServiceEquipmentStub.Writeoff[] returnedWriteoff = response4.get_return();
            list = Arrays.asList(returnedWriteoff);
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public void addEquipment(Equipment eq)
    {
        try{
            MySQLServiceEquipmentStub.AddEquipment equipmentOperation = new MySQLServiceEquipmentStub.AddEquipment();
            equipmentOperation.setEquipment(eq);
            MySQLServiceEquipmentStub.AddEquipmentResponse response = stub.addEquipment(equipmentOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addCabinet(Cabinet cab)
    {
        try{
            MySQLServiceEquipmentStub.AddCabinet cabinetOperation = new MySQLServiceEquipmentStub.AddCabinet();
            cabinetOperation.setCabinet(cab);
            MySQLServiceEquipmentStub.AddCabinetResponse response = stub.addCabinet(cabinetOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addResponsible(Responsible resp)
    {
        try{
            MySQLServiceEquipmentStub.AddResponsible responsibleOperation = new MySQLServiceEquipmentStub.AddResponsible();
            responsibleOperation.setResponsible(resp);
            MySQLServiceEquipmentStub.AddResponsibleResponse response = stub.addResponsible(responsibleOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addDistribution(Distribution dist)
    {
        try{
            MySQLServiceEquipmentStub.AddDistribution distributionOperation = new MySQLServiceEquipmentStub.AddDistribution();
            distributionOperation.setDistribution(dist);
            MySQLServiceEquipmentStub.AddDistributionResponse response = stub.addDistribution(distributionOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addWriteoff(Writeoff wr)
    {
        try{
            MySQLServiceEquipmentStub.AddWriteoff writeoffOperation = new MySQLServiceEquipmentStub.AddWriteoff();
            writeoffOperation.setWriteoff(wr);
            MySQLServiceEquipmentStub.AddWriteoffResponse response = stub.addWriteoff(writeoffOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delEquipment(int code)
    {
        try{
            MySQLServiceEquipmentStub.DelEquipment equipmentOperation = new MySQLServiceEquipmentStub.DelEquipment();
            equipmentOperation.setCode(code);
            MySQLServiceEquipmentStub.DelEquipmentResponse response = stub.delEquipment(equipmentOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delCabinet(int code)
    {
        try{
            MySQLServiceEquipmentStub.DelCabinet cabinetOperation = new MySQLServiceEquipmentStub.DelCabinet();
            cabinetOperation.setCode(code);
            MySQLServiceEquipmentStub.DelCabinetResponse response = stub.delCabinet(cabinetOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delResponsible(int code)
    {
        try{
            MySQLServiceEquipmentStub.DelResponsible responsibleOperation = new MySQLServiceEquipmentStub.DelResponsible();
            responsibleOperation.setCode(code);
            MySQLServiceEquipmentStub.DelResponsibleResponse response = stub.delResponsible(responsibleOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delDistribution(int code)
    {
        try{
            MySQLServiceEquipmentStub.DelDistribution distributionOperation = new MySQLServiceEquipmentStub.DelDistribution();
            distributionOperation.setCode(code);
            MySQLServiceEquipmentStub.DelDistributionResponse response = stub.delDistribution(distributionOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delWriteoff(int code)
    {
        try{
            MySQLServiceEquipmentStub.DelWriteoff writeoffOperation = new MySQLServiceEquipmentStub.DelWriteoff();
            writeoffOperation.setCode(code);
            MySQLServiceEquipmentStub.DelWriteoffResponse response = stub.delWriteoff(writeoffOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editEquipment(Equipment eq)
    {
        try{
            MySQLServiceEquipmentStub.EditEquipment equipmentOperation = new MySQLServiceEquipmentStub.EditEquipment();
            equipmentOperation.setEquipment(eq);
            MySQLServiceEquipmentStub.EditEquipmentResponse response = stub.editEquipment(equipmentOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editCabinet(Cabinet cab)
    {
        try{
            MySQLServiceEquipmentStub.EditCabinet cabinetOperation = new MySQLServiceEquipmentStub.EditCabinet();
            cabinetOperation.setCabinet(cab);
            MySQLServiceEquipmentStub.EditCabinetResponse response = stub.editCabinet(cabinetOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editResponsible(Responsible resp)
    {
        try{
            MySQLServiceEquipmentStub.EditResponsible responsibleOperation = new MySQLServiceEquipmentStub.EditResponsible();
            responsibleOperation.setResponsible(resp);
            MySQLServiceEquipmentStub.EditResponsibleResponse response = stub.editResponsible(responsibleOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editDistribution(Distribution dist)
    {
        try{
            MySQLServiceEquipmentStub.EditDistribution distributionOperation = new MySQLServiceEquipmentStub.EditDistribution();
            distributionOperation.setDistribution(dist);
            MySQLServiceEquipmentStub.EditDistributionResponse response = stub.editDistribution(distributionOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editWriteoff(Writeoff wr)
    {
        try{
            MySQLServiceEquipmentStub.EditWriteoff writeoffOperation = new MySQLServiceEquipmentStub.EditWriteoff();
            writeoffOperation.setWriteoff(wr);
            MySQLServiceEquipmentStub.EditWriteoffResponse response = stub.editWriteoff(writeoffOperation);
            String result = response.get_return();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void close(){
        System.out.println("Connection closed");
    }
}


