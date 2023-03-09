package prototype;

import java.util.Date;

/**
 * 1.实现一个接口 Cloneable
 * 2.重写一个方法 clone()
 */
public class VideoDeep implements Cloneable{
    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 在克隆方法里对克隆的结果进行克隆
        Object obj = super.clone();
        // 实现深克隆
        VideoDeep video = (VideoDeep) obj;
        // 克隆属性
        video.createTime = (Date) this.createTime.clone();
        return obj;

    }

    public VideoDeep(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public VideoDeep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "VideoDeep{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
