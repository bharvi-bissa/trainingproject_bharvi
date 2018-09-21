package com.techaspect.entity;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int vendorId;
	private String price;
	private String quantity;
	private String description;
	private String category;
	private String subcategory;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private int descriptionId;
	private String prodouctDescription1;
	private String prodouctDescription2;
	private String prodouctDescription3;
	private String prodouctDescription4;
	private String prodouctDescription5;
	private String prodouctDescription6;
	private String prodouctDescription7;
	private String prodouctDescription8;
	private String prodouctDescription9;
	private String prodouctDescription10;
	private String productDescriptionTitle1;
	private String productDescriptionTitle2;
	private String productDescriptionTitle3;
	private String productDescriptionTitle4;
	private String productDescriptionTitle5;
	private String productDescriptionTitle6;
	private String productDescriptionTitle7;
	private String productDescriptionTitle8;
	private String productDescriptionTitle9;
	private String productDescriptionTitle10;
	private int specId;
	private String box ;
	private String modelNumber ;
	private String modelName ;
	private String modelColor ;
	private String browseType ;
	private String simType ;
	
	private String touchScreen ;
	private String displaySize;
	private String resolution;
	private String resoType;
	private String displayType;
	private String displayColors;
	
	private String os;
	private String processorType;
	private String processorCore ;
	private String pClockspeed ;
	private String sClockspeed ;
	private String opFreq ;
	
	private String internalStorage ;
	private String ram ;
	private String expStorage ;
	private String suppMemCardType ;
	private String callLogMemory ;
	
	private String pCameraAvailable;
	private String pCamera;
	private String pCameraFeatures ;
	private String sCameraAvail ;
	private String sCamera ;
	private String sCameraFeatures ;
	private String flash ;
	private String hdRecording ;
	private String fhdRecording ;
	private String vRecording ;
	private String vrResolution ;
	private String frameRate ;
	
	private String phoneBook ;
	private String networkType ;
	private String suppNetworks ;
	private String threeG;
	private String gprs;
	private String preInstalledBrowser;
	
	private String bluetoothSupp;
	private String bluetoothVer ;
	private String wifi ;
	private String iConn ;
	private String wifiVer ;
	private String nfc ;
	private String usbConn;
	private String audioJack ;
	private String smartPhone;
	private String simSize ;
	private String remoBattery ;
	private String sms ;
	private String sensors ;
	private String otherFeatures;
	private String impApps;
	private String audioFormats;
	private String videoFormats ;
	private String battCapacity ;
	private String battType ;
	private String width  ;
	private String height ;
	private String depth; 
	private String weight ;
	private String warrantySum ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public String getImage5() {
		return image5;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public int getDescriptionId() {
		return descriptionId;
	}
	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}
	public String getProdouctDescription1() {
		return prodouctDescription1;
	}
	public void setProdouctDescription1(String prodouctDescription1) {
		this.prodouctDescription1 = prodouctDescription1;
	}
	public String getProdouctDescription2() {
		return prodouctDescription2;
	}
	public void setProdouctDescription2(String prodouctDescription2) {
		this.prodouctDescription2 = prodouctDescription2;
	}
	public String getProdouctDescription3() {
		return prodouctDescription3;
	}
	public void setProdouctDescription3(String prodouctDescription3) {
		this.prodouctDescription3 = prodouctDescription3;
	}
	public String getProdouctDescription4() {
		return prodouctDescription4;
	}
	public void setProdouctDescription4(String prodouctDescription4) {
		this.prodouctDescription4 = prodouctDescription4;
	}
	public String getProdouctDescription5() {
		return prodouctDescription5;
	}
	public void setProdouctDescription5(String prodouctDescription5) {
		this.prodouctDescription5 = prodouctDescription5;
	}
	public String getProdouctDescription6() {
		return prodouctDescription6;
	}
	public void setProdouctDescription6(String prodouctDescription6) {
		this.prodouctDescription6 = prodouctDescription6;
	}
	public String getProdouctDescription7() {
		return prodouctDescription7;
	}
	public void setProdouctDescription7(String prodouctDescription7) {
		this.prodouctDescription7 = prodouctDescription7;
	}
	public String getProdouctDescription8() {
		return prodouctDescription8;
	}
	public void setProdouctDescription8(String prodouctDescription8) {
		this.prodouctDescription8 = prodouctDescription8;
	}
	public String getProdouctDescription9() {
		return prodouctDescription9;
	}
	public void setProdouctDescription9(String prodouctDescription9) {
		this.prodouctDescription9 = prodouctDescription9;
	}
	public String getProdouctDescription10() {
		return prodouctDescription10;
	}
	public void setProdouctDescription10(String prodouctDescription10) {
		this.prodouctDescription10 = prodouctDescription10;
	}
	public String getProductDescriptionTitle1() {
		return productDescriptionTitle1;
	}
	public void setProductDescriptionTitle1(String productDescriptionTitle1) {
		this.productDescriptionTitle1 = productDescriptionTitle1;
	}
	public String getProductDescriptionTitle2() {
		return productDescriptionTitle2;
	}
	public void setProductDescriptionTitle2(String productDescriptionTitle2) {
		this.productDescriptionTitle2 = productDescriptionTitle2;
	}
	public String getProductDescriptionTitle3() {
		return productDescriptionTitle3;
	}
	public void setProductDescriptionTitle3(String productDescriptionTitle3) {
		this.productDescriptionTitle3 = productDescriptionTitle3;
	}
	public String getProductDescriptionTitle4() {
		return productDescriptionTitle4;
	}
	public void setProductDescriptionTitle4(String productDescriptionTitle4) {
		this.productDescriptionTitle4 = productDescriptionTitle4;
	}
	public String getProductDescriptionTitle5() {
		return productDescriptionTitle5;
	}
	public void setProductDescriptionTitle5(String productDescriptionTitle5) {
		this.productDescriptionTitle5 = productDescriptionTitle5;
	}
	public String getProductDescriptionTitle6() {
		return productDescriptionTitle6;
	}
	public void setProductDescriptionTitle6(String productDescriptionTitle6) {
		this.productDescriptionTitle6 = productDescriptionTitle6;
	}
	public String getProductDescriptionTitle7() {
		return productDescriptionTitle7;
	}
	public void setProductDescriptionTitle7(String productDescriptionTitle7) {
		this.productDescriptionTitle7 = productDescriptionTitle7;
	}
	public String getProductDescriptionTitle8() {
		return productDescriptionTitle8;
	}
	public void setProductDescriptionTitle8(String productDescriptionTitle8) {
		this.productDescriptionTitle8 = productDescriptionTitle8;
	}
	public String getProductDescriptionTitle9() {
		return productDescriptionTitle9;
	}
	public void setProductDescriptionTitle9(String productDescriptionTitle9) {
		this.productDescriptionTitle9 = productDescriptionTitle9;
	}
	public String getProductDescriptionTitle10() {
		return productDescriptionTitle10;
	}
	public void setProductDescriptionTitle10(String productDescriptionTitle10) {
		this.productDescriptionTitle10 = productDescriptionTitle10;
	}
	public int getSpecId() {
		return specId;
	}
	public void setSpecId(int specId) {
		this.specId = specId;
	}
	public String getBox() {
		return box;
	}
	public void setBox(String box) {
		this.box = box;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelColor() {
		return modelColor;
	}
	public void setModelColor(String modelColor) {
		this.modelColor = modelColor;
	}
	public String getBrowseType() {
		return browseType;
	}
	public void setBrowseType(String browseType) {
		this.browseType = browseType;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public String getTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getResoType() {
		return resoType;
	}
	public void setResoType(String resoType) {
		this.resoType = resoType;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDisplayColors() {
		return displayColors;
	}
	public void setDisplayColors(String displayColors) {
		this.displayColors = displayColors;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProcessorCore() {
		return processorCore;
	}
	public void setProcessorCore(String processorCore) {
		this.processorCore = processorCore;
	}
	public String getpClockspeed() {
		return pClockspeed;
	}
	public void setpClockspeed(String pClockspeed) {
		this.pClockspeed = pClockspeed;
	}
	public String getsClockspeed() {
		return sClockspeed;
	}
	public void setsClockspeed(String sClockspeed) {
		this.sClockspeed = sClockspeed;
	}
	public String getOpFreq() {
		return opFreq;
	}
	public void setOpFreq(String opFreq) {
		this.opFreq = opFreq;
	}
	public String getInternalStorage() {
		return internalStorage;
	}
	public void setInternalStorage(String internalStorage) {
		this.internalStorage = internalStorage;
	}
	public String getExpStorage() {
		return expStorage;
	}
	public void setExpStorage(String expStorage) {
		this.expStorage = expStorage;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getSuppMemCardType() {
		return suppMemCardType;
	}
	public void setSuppMemCardType(String suppMemCardType) {
		this.suppMemCardType = suppMemCardType;
	}
	public String getCallLogMemory() {
		return callLogMemory;
	}
	public void setCallLogMemory(String callLogMemory) {
		this.callLogMemory = callLogMemory;
	}
	public String getpCameraAvailable() {
		return pCameraAvailable;
	}
	public void setpCameraAvailable(String pCameraAvailable) {
		this.pCameraAvailable = pCameraAvailable;
	}
	public String getsCameraAvail() {
		return sCameraAvail;
	}
	public void setsCameraAvail(String sCameraAvail) {
		this.sCameraAvail = sCameraAvail;
	}
	public String getpCamera() {
		return pCamera;
	}
	public void setpCamera(String pCamera) {
		this.pCamera = pCamera;
	}
	public String getpCameraFeatures() {
		return pCameraFeatures;
	}
	public void setpCameraFeatures(String pCameraFeatures) {
		this.pCameraFeatures = pCameraFeatures;
	}
	public String getsCamera() {
		return sCamera;
	}
	public void setsCamera(String sCamera) {
		this.sCamera = sCamera;
	}
	public String getsCameraFeatures() {
		return sCameraFeatures;
	}
	public void setsCameraFeatures(String sCameraFeatures) {
		this.sCameraFeatures = sCameraFeatures;
	}
	public String getFlash() {
		return flash;
	}
	public void setFlash(String flash) {
		this.flash = flash;
	}
	public String getHdRecording() {
		return hdRecording;
	}
	public void setHdRecording(String hdRecording) {
		this.hdRecording = hdRecording;
	}
	public String getFhdRecording() {
		return fhdRecording;
	}
	public void setFhdRecording(String fhdRecording) {
		this.fhdRecording = fhdRecording;
	}
	public String getvRecording() {
		return vRecording;
	}
	public void setvRecording(String vRecording) {
		this.vRecording = vRecording;
	}
	public String getVrResolution() {
		return vrResolution;
	}
	public void setVrResolution(String vrResolution) {
		this.vrResolution = vrResolution;
	}
	public String getFrameRate() {
		return frameRate;
	}
	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}
	public String getPhoneBook() {
		return phoneBook;
	}
	public void setPhoneBook(String phoneBook) {
		this.phoneBook = phoneBook;
	}
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	public String getSuppNetworks() {
		return suppNetworks;
	}
	public void setSuppNetworks(String suppNetworks) {
		this.suppNetworks = suppNetworks;
	}
	public String getThreeG() {
		return threeG;
	}
	public void setThreeG(String threeG) {
		this.threeG = threeG;
	}
	public String getGprs() {
		return gprs;
	}
	public void setGprs(String gprs) {
		this.gprs = gprs;
	}
	public String getPreInstalledBrowser() {
		return preInstalledBrowser;
	}
	public void setPreInstalledBrowser(String preInstalledBrowser) {
		this.preInstalledBrowser = preInstalledBrowser;
	}
	public String getBluetoothSupp() {
		return bluetoothSupp;
	}
	public void setBluetoothSupp(String bluetoothSupp) {
		this.bluetoothSupp = bluetoothSupp;
	}
	public String getBluetoothVer() {
		return bluetoothVer;
	}
	public void setBluetoothVer(String bluetoothVer) {
		this.bluetoothVer = bluetoothVer;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getiConn() {
		return iConn;
	}
	public void setiConn(String iConn) {
		this.iConn = iConn;
	}
	public String getWifiVer() {
		return wifiVer;
	}
	public void setWifiVer(String wifiVer) {
		this.wifiVer = wifiVer;
	}
	public String getNfc() {
		return nfc;
	}
	public void setNfc(String nfc) {
		this.nfc = nfc;
	}
	public String getUsbConn() {
		return usbConn;
	}
	public void setUsbConn(String usbConn) {
		this.usbConn = usbConn;
	}
	public String getAudioJack() {
		return audioJack;
	}
	public void setAudioJack(String audioJack) {
		this.audioJack = audioJack;
	}
	public String getSmartPhone() {
		return smartPhone;
	}
	public void setSmartPhone(String smartPhone) {
		this.smartPhone = smartPhone;
	}
	public String getSimSize() {
		return simSize;
	}
	public void setSimSize(String simSize) {
		this.simSize = simSize;
	}
	public String getRemoBattery() {
		return remoBattery;
	}
	public void setRemoBattery(String remoBattery) {
		this.remoBattery = remoBattery;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public String getSensors() {
		return sensors;
	}
	public void setSensors(String sensors) {
		this.sensors = sensors;
	}
	public String getOtherFeatures() {
		return otherFeatures;
	}
	public void setOtherFeatures(String otherFeatures) {
		this.otherFeatures = otherFeatures;
	}
	public String getImpApps() {
		return impApps;
	}
	public void setImpApps(String impApps) {
		this.impApps = impApps;
	}
	public String getAudioFormats() {
		return audioFormats;
	}
	public void setAudioFormats(String audioFormats) {
		this.audioFormats = audioFormats;
	}
	public String getVideoFormats() {
		return videoFormats;
	}
	public void setVideoFormats(String videoFormats) {
		this.videoFormats = videoFormats;
	}
	public String getBattCapacity() {
		return battCapacity;
	}
	public void setBattCapacity(String battCapacity) {
		this.battCapacity = battCapacity;
	}
	public String getBattType() {
		return battType;
	}
	public void setBattType(String battType) {
		this.battType = battType;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWarrantySum() {
		return warrantySum;
	}
	public void setWarrantySum(String warrantySum) {
		this.warrantySum = warrantySum;
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	
}
