package com.bernard.beaconportal;

public class RowItem {

	private int imageId;
    private String title;
    private String desc;
    private String teacher;
 
    public RowItem(int imageId, String title, String desc, String teacher) {
        this.imageId = imageId;
        this.title = title;
        this.desc = desc;
        this.teacher = teacher;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTeacher() {
            return teacher;
        }
        public void setTeacher(String teacher) {
            this.title = teacher;
    }
    @Override
    public String toString() {
        return title + "\n" + desc;
    }
	
}
