package de.kernpunkt.document.model;

/**
 * Created by nmodjo on 03.07.2017.
 */
public class Type {

    private int typeId;
    private String name;
    private String desc;
    private String extension;

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {

        return desc;
    }
}
