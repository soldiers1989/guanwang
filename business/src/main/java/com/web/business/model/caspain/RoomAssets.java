package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class RoomAssets implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer version;

    private Boolean isDelete;

    private String name;

    private Boolean washingMachines;

    private Boolean airConditionings;

    private Boolean televisions;

    private Boolean fridge;

    private Boolean internet;

    private Boolean balconies;

    private Boolean windows;

    private Boolean kitchens;

    private Boolean washrooms;

    private Boolean waterHeaters;

    private Boolean wardrobes;

    private Boolean desks;

    private Integer createdById;

    private Integer deletedById;

    private Integer updatedById;

    private Boolean bed;

    private Boolean gas;

    private Boolean heat;

    private Boolean inductionCooker;

    private Boolean microwave;

    private Boolean oven;

    private Boolean serAtm;

    private Boolean serExpress;

    private Boolean serGymnasium;

    private Boolean serMarket;

    private Boolean serRoomCleaning;

    private Boolean serServices;

    private Boolean serSmartLock;

    private Boolean sofa;

    private Boolean tagBalcony;

    private Boolean tagKitchen;

    private Boolean tagMetro;

    private Boolean tagPubBalcony;

    private Boolean tagPubToilet;

    private Boolean tagToilet;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getWashingMachines() {
        return washingMachines;
    }

    public void setWashingMachines(Boolean washingMachines) {
        this.washingMachines = washingMachines;
    }

    public Boolean getAirConditionings() {
        return airConditionings;
    }

    public void setAirConditionings(Boolean airConditionings) {
        this.airConditionings = airConditionings;
    }

    public Boolean getTelevisions() {
        return televisions;
    }

    public void setTelevisions(Boolean televisions) {
        this.televisions = televisions;
    }

    public Boolean getFridge() {
        return fridge;
    }

    public void setFridge(Boolean fridge) {
        this.fridge = fridge;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public Boolean getBalconies() {
        return balconies;
    }

    public void setBalconies(Boolean balconies) {
        this.balconies = balconies;
    }

    public Boolean getWindows() {
        return windows;
    }

    public void setWindows(Boolean windows) {
        this.windows = windows;
    }

    public Boolean getKitchens() {
        return kitchens;
    }

    public void setKitchens(Boolean kitchens) {
        this.kitchens = kitchens;
    }

    public Boolean getWashrooms() {
        return washrooms;
    }

    public void setWashrooms(Boolean washrooms) {
        this.washrooms = washrooms;
    }

    public Boolean getWaterHeaters() {
        return waterHeaters;
    }

    public void setWaterHeaters(Boolean waterHeaters) {
        this.waterHeaters = waterHeaters;
    }

    public Boolean getWardrobes() {
        return wardrobes;
    }

    public void setWardrobes(Boolean wardrobes) {
        this.wardrobes = wardrobes;
    }

    public Boolean getDesks() {
        return desks;
    }

    public void setDesks(Boolean desks) {
        this.desks = desks;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Integer getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(Integer deletedById) {
        this.deletedById = deletedById;
    }

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    public Boolean getBed() {
        return bed;
    }

    public void setBed(Boolean bed) {
        this.bed = bed;
    }

    public Boolean getGas() {
        return gas;
    }

    public void setGas(Boolean gas) {
        this.gas = gas;
    }

    public Boolean getHeat() {
        return heat;
    }

    public void setHeat(Boolean heat) {
        this.heat = heat;
    }

    public Boolean getInductionCooker() {
        return inductionCooker;
    }

    public void setInductionCooker(Boolean inductionCooker) {
        this.inductionCooker = inductionCooker;
    }

    public Boolean getMicrowave() {
        return microwave;
    }

    public void setMicrowave(Boolean microwave) {
        this.microwave = microwave;
    }

    public Boolean getOven() {
        return oven;
    }

    public void setOven(Boolean oven) {
        this.oven = oven;
    }

    public Boolean getSerAtm() {
        return serAtm;
    }

    public void setSerAtm(Boolean serAtm) {
        this.serAtm = serAtm;
    }

    public Boolean getSerExpress() {
        return serExpress;
    }

    public void setSerExpress(Boolean serExpress) {
        this.serExpress = serExpress;
    }

    public Boolean getSerGymnasium() {
        return serGymnasium;
    }

    public void setSerGymnasium(Boolean serGymnasium) {
        this.serGymnasium = serGymnasium;
    }

    public Boolean getSerMarket() {
        return serMarket;
    }

    public void setSerMarket(Boolean serMarket) {
        this.serMarket = serMarket;
    }

    public Boolean getSerRoomCleaning() {
        return serRoomCleaning;
    }

    public void setSerRoomCleaning(Boolean serRoomCleaning) {
        this.serRoomCleaning = serRoomCleaning;
    }

    public Boolean getSerServices() {
        return serServices;
    }

    public void setSerServices(Boolean serServices) {
        this.serServices = serServices;
    }

    public Boolean getSerSmartLock() {
        return serSmartLock;
    }

    public void setSerSmartLock(Boolean serSmartLock) {
        this.serSmartLock = serSmartLock;
    }

    public Boolean getSofa() {
        return sofa;
    }

    public void setSofa(Boolean sofa) {
        this.sofa = sofa;
    }

    public Boolean getTagBalcony() {
        return tagBalcony;
    }

    public void setTagBalcony(Boolean tagBalcony) {
        this.tagBalcony = tagBalcony;
    }

    public Boolean getTagKitchen() {
        return tagKitchen;
    }

    public void setTagKitchen(Boolean tagKitchen) {
        this.tagKitchen = tagKitchen;
    }

    public Boolean getTagMetro() {
        return tagMetro;
    }

    public void setTagMetro(Boolean tagMetro) {
        this.tagMetro = tagMetro;
    }

    public Boolean getTagPubBalcony() {
        return tagPubBalcony;
    }

    public void setTagPubBalcony(Boolean tagPubBalcony) {
        this.tagPubBalcony = tagPubBalcony;
    }

    public Boolean getTagPubToilet() {
        return tagPubToilet;
    }

    public void setTagPubToilet(Boolean tagPubToilet) {
        this.tagPubToilet = tagPubToilet;
    }

    public Boolean getTagToilet() {
        return tagToilet;
    }

    public void setTagToilet(Boolean tagToilet) {
        this.tagToilet = tagToilet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", version=").append(version);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", name=").append(name);
        sb.append(", washingMachines=").append(washingMachines);
        sb.append(", airConditionings=").append(airConditionings);
        sb.append(", televisions=").append(televisions);
        sb.append(", fridge=").append(fridge);
        sb.append(", internet=").append(internet);
        sb.append(", balconies=").append(balconies);
        sb.append(", windows=").append(windows);
        sb.append(", kitchens=").append(kitchens);
        sb.append(", washrooms=").append(washrooms);
        sb.append(", waterHeaters=").append(waterHeaters);
        sb.append(", wardrobes=").append(wardrobes);
        sb.append(", desks=").append(desks);
        sb.append(", createdById=").append(createdById);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", bed=").append(bed);
        sb.append(", gas=").append(gas);
        sb.append(", heat=").append(heat);
        sb.append(", inductionCooker=").append(inductionCooker);
        sb.append(", microwave=").append(microwave);
        sb.append(", oven=").append(oven);
        sb.append(", serAtm=").append(serAtm);
        sb.append(", serExpress=").append(serExpress);
        sb.append(", serGymnasium=").append(serGymnasium);
        sb.append(", serMarket=").append(serMarket);
        sb.append(", serRoomCleaning=").append(serRoomCleaning);
        sb.append(", serServices=").append(serServices);
        sb.append(", serSmartLock=").append(serSmartLock);
        sb.append(", sofa=").append(sofa);
        sb.append(", tagBalcony=").append(tagBalcony);
        sb.append(", tagKitchen=").append(tagKitchen);
        sb.append(", tagMetro=").append(tagMetro);
        sb.append(", tagPubBalcony=").append(tagPubBalcony);
        sb.append(", tagPubToilet=").append(tagPubToilet);
        sb.append(", tagToilet=").append(tagToilet);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}