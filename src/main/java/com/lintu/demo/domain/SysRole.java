package com.lintu.demo.domain;

public class SysRole {
    private Integer sysRoleId;
    private Byte sysRoleAva; //角色是否生效
    private String sysRoleDes;//角色描述
    private String sysRoleName;//角色名称

    public Integer getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public Byte getSysRoleAva() {
        return sysRoleAva;
    }

    public void setSysRoleAva(Byte sysRoleAva) {
        this.sysRoleAva = sysRoleAva;
    }

    public String getSysRoleDes() {
        return sysRoleDes;
    }

    public void setSysRoleDes(String sysRoleDes) {
        this.sysRoleDes = sysRoleDes;
    }

    public String getSysRoleName() {
        return sysRoleName;
    }

    public void setSysRoleName(String sysRoleName) {
        this.sysRoleName = sysRoleName;
    }
}
