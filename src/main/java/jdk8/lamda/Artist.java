package jdk8.lamda;

/**
 * @version V1.0.0
 * @description: 创作音乐的团体或个人
 * @packagename: com.example.mybatisstudy.entity
 * @author: yuanqingtao
 * @date: 2024-10-27 10:42
 **/
public class Artist {
    //艺术家名称
    private String name;
    //团队成员
    private String members;
    //艺术家来源
    private String origin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
