package com.moeller.rolespermissions.business;

/**
 * Created by Moeller.Bernd on 07.08.2016.
 */
public class Permission {

  private long id;
  private String name;
  private boolean active;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public Permission name(final String name){
    this.name = name;
    return this;
  }

  public Permission id(final long id){
    this.id = id;
    return this;
  }

  public void rhabarber(){

  }
}
