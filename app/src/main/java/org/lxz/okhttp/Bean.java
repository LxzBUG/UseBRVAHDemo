package org.lxz.okhttp;

import java.util.List;

/**
 * Created by liuxiaozhong on 2016/8/26.
 */
public class Bean {

    /**
     * createTime : 1468581654590
     * updateTime : 1470105465143
     * createTimeStr : 2016-07-15 19:20:54
     * updateTimeStr : 2016-08-02 10:37:45
     * isDel : 0
     * goodsId : 1750268522693632
     * goodsName : 冰糖醋姜
     * goodsSubtitle :
     * gcId : 1750261950710784
     * goodsType : 0
     * gcName : 萍乡特色馆
     * brandId : 0
     * brandName :
     * typeId : 28
     * storeId : 1750157709739008
     * storeName : 萍乡特色馆
     * specOpen : 1
     * specId : 1775234634499072
     * specName :
     * goodsImage : /upload/img/store/1750157709739008/1470105453378.jpg
     * goodsImageMore : /upload/img/store/1750157709739008/1470105453378.jpg,/upload/img/store/1750157709739008/1468581570246.JPG,/upload/img/store/1750157709739008/1468581575102.jpg,/upload/img/store/1750157709739008/1468581583561.jpg,/upload/img/store/1750157709739008/1468581593987.jpg,/upload/img/store/1750157709739008/1468581615692.jpg,
     * goodsStorePrice : 37.0
     * goodsSerial :
     * goodsShow : 1
     * goodsClick : 1
     * goodsState : 30
     * goodsCommend : 1
     * goodsKeywords :
     * goodsDescription :
     * goodsBody :
     * goodsAttr :
     * goodsSpec :
     * goodsColImg :
     * goodsForm : 1
     * transportId : 0
     * pyPrice : 0.0
     * kdPrice : 0.0
     * esPrice : 0.0
     * cityId : 3603
     * cityName : 萍乡市
     * provinceId : 36
     * provinceName : 江西省
     * goodsStoreState : 0
     * commentnum : 0
     * salenum : 0
     * goodsCollect : 0
     * goodsTransfeeCharge : 1
     * goodsTotalStorage : 9564
     * goodsMarketPrice : 40.0
     * goodCostPrice : 32.0
     */

    private List<ResultBean> result;

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        private long createTime;
        private long updateTime;
        private String createTimeStr;
        private String updateTimeStr;
        private int isDel;
        private String goodsId;
        private String goodsName;
        private String goodsSubtitle;
        private String gcId;
        private int goodsType;
        private String gcName;
        private String brandId;
        private String brandName;
        private String typeId;
        private String storeId;
        private String storeName;
        private int specOpen;
        private String specId;
        private String specName;
        private String goodsImage;
        private String goodsImageMore;
        private double goodsStorePrice;
        private String goodsSerial;
        private int goodsShow;
        private int goodsClick;
        private int goodsState;
        private int goodsCommend;
        private String goodsKeywords;
        private String goodsDescription;
        private String goodsBody;
        private String goodsAttr;
        private String goodsSpec;
        private String goodsColImg;
        private int goodsForm;
        private String transportId;
        private double pyPrice;
        private double kdPrice;
        private double esPrice;
        private String cityId;
        private String cityName;
        private String provinceId;
        private String provinceName;
        private int goodsStoreState;
        private int commentnum;
        private int salenum;
        private int goodsCollect;
        private int goodsTransfeeCharge;
        private int goodsTotalStorage;
        private double goodsMarketPrice;
        private double goodCostPrice;

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public String getCreateTimeStr() {
            return createTimeStr;
        }

        public void setCreateTimeStr(String createTimeStr) {
            this.createTimeStr = createTimeStr;
        }

        public String getUpdateTimeStr() {
            return updateTimeStr;
        }

        public void setUpdateTimeStr(String updateTimeStr) {
            this.updateTimeStr = updateTimeStr;
        }

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getGoodsSubtitle() {
            return goodsSubtitle;
        }

        public void setGoodsSubtitle(String goodsSubtitle) {
            this.goodsSubtitle = goodsSubtitle;
        }

        public String getGcId() {
            return gcId;
        }

        public void setGcId(String gcId) {
            this.gcId = gcId;
        }

        public int getGoodsType() {
            return goodsType;
        }

        public void setGoodsType(int goodsType) {
            this.goodsType = goodsType;
        }

        public String getGcName() {
            return gcName;
        }

        public void setGcName(String gcName) {
            this.gcName = gcName;
        }

        public String getBrandId() {
            return brandId;
        }

        public void setBrandId(String brandId) {
            this.brandId = brandId;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getTypeId() {
            return typeId;
        }

        public void setTypeId(String typeId) {
            this.typeId = typeId;
        }

        public String getStoreId() {
            return storeId;
        }

        public void setStoreId(String storeId) {
            this.storeId = storeId;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public int getSpecOpen() {
            return specOpen;
        }

        public void setSpecOpen(int specOpen) {
            this.specOpen = specOpen;
        }

        public String getSpecId() {
            return specId;
        }

        public void setSpecId(String specId) {
            this.specId = specId;
        }

        public String getSpecName() {
            return specName;
        }

        public void setSpecName(String specName) {
            this.specName = specName;
        }

        public String getGoodsImage() {
            return goodsImage;
        }

        public void setGoodsImage(String goodsImage) {
            this.goodsImage = goodsImage;
        }

        public String getGoodsImageMore() {
            return goodsImageMore;
        }

        public void setGoodsImageMore(String goodsImageMore) {
            this.goodsImageMore = goodsImageMore;
        }

        public double getGoodsStorePrice() {
            return goodsStorePrice;
        }

        public void setGoodsStorePrice(double goodsStorePrice) {
            this.goodsStorePrice = goodsStorePrice;
        }

        public String getGoodsSerial() {
            return goodsSerial;
        }

        public void setGoodsSerial(String goodsSerial) {
            this.goodsSerial = goodsSerial;
        }

        public int getGoodsShow() {
            return goodsShow;
        }

        public void setGoodsShow(int goodsShow) {
            this.goodsShow = goodsShow;
        }

        public int getGoodsClick() {
            return goodsClick;
        }

        public void setGoodsClick(int goodsClick) {
            this.goodsClick = goodsClick;
        }

        public int getGoodsState() {
            return goodsState;
        }

        public void setGoodsState(int goodsState) {
            this.goodsState = goodsState;
        }

        public int getGoodsCommend() {
            return goodsCommend;
        }

        public void setGoodsCommend(int goodsCommend) {
            this.goodsCommend = goodsCommend;
        }

        public String getGoodsKeywords() {
            return goodsKeywords;
        }

        public void setGoodsKeywords(String goodsKeywords) {
            this.goodsKeywords = goodsKeywords;
        }

        public String getGoodsDescription() {
            return goodsDescription;
        }

        public void setGoodsDescription(String goodsDescription) {
            this.goodsDescription = goodsDescription;
        }

        public String getGoodsBody() {
            return goodsBody;
        }

        public void setGoodsBody(String goodsBody) {
            this.goodsBody = goodsBody;
        }

        public String getGoodsAttr() {
            return goodsAttr;
        }

        public void setGoodsAttr(String goodsAttr) {
            this.goodsAttr = goodsAttr;
        }

        public String getGoodsSpec() {
            return goodsSpec;
        }

        public void setGoodsSpec(String goodsSpec) {
            this.goodsSpec = goodsSpec;
        }

        public String getGoodsColImg() {
            return goodsColImg;
        }

        public void setGoodsColImg(String goodsColImg) {
            this.goodsColImg = goodsColImg;
        }

        public int getGoodsForm() {
            return goodsForm;
        }

        public void setGoodsForm(int goodsForm) {
            this.goodsForm = goodsForm;
        }

        public String getTransportId() {
            return transportId;
        }

        public void setTransportId(String transportId) {
            this.transportId = transportId;
        }

        public double getPyPrice() {
            return pyPrice;
        }

        public void setPyPrice(double pyPrice) {
            this.pyPrice = pyPrice;
        }

        public double getKdPrice() {
            return kdPrice;
        }

        public void setKdPrice(double kdPrice) {
            this.kdPrice = kdPrice;
        }

        public double getEsPrice() {
            return esPrice;
        }

        public void setEsPrice(double esPrice) {
            this.esPrice = esPrice;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getProvinceId() {
            return provinceId;
        }

        public void setProvinceId(String provinceId) {
            this.provinceId = provinceId;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public int getGoodsStoreState() {
            return goodsStoreState;
        }

        public void setGoodsStoreState(int goodsStoreState) {
            this.goodsStoreState = goodsStoreState;
        }

        public int getCommentnum() {
            return commentnum;
        }

        public void setCommentnum(int commentnum) {
            this.commentnum = commentnum;
        }

        public int getSalenum() {
            return salenum;
        }

        public void setSalenum(int salenum) {
            this.salenum = salenum;
        }

        public int getGoodsCollect() {
            return goodsCollect;
        }

        public void setGoodsCollect(int goodsCollect) {
            this.goodsCollect = goodsCollect;
        }

        public int getGoodsTransfeeCharge() {
            return goodsTransfeeCharge;
        }

        public void setGoodsTransfeeCharge(int goodsTransfeeCharge) {
            this.goodsTransfeeCharge = goodsTransfeeCharge;
        }

        public int getGoodsTotalStorage() {
            return goodsTotalStorage;
        }

        public void setGoodsTotalStorage(int goodsTotalStorage) {
            this.goodsTotalStorage = goodsTotalStorage;
        }

        public double getGoodsMarketPrice() {
            return goodsMarketPrice;
        }

        public void setGoodsMarketPrice(double goodsMarketPrice) {
            this.goodsMarketPrice = goodsMarketPrice;
        }

        public double getGoodCostPrice() {
            return goodCostPrice;
        }

        public void setGoodCostPrice(double goodCostPrice) {
            this.goodCostPrice = goodCostPrice;
        }
    }
}
