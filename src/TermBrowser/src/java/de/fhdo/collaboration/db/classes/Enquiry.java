/* 
 * CTS2 based Terminology Server and Terminology Browser
 * Copyright (C) 2014 FH Dortmund: Peter Haas, Robert Muetzner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.fhdo.collaboration.db.classes;
// Generated 15.05.2013 18:02:38 by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Collaborationuser generated by hbm2java
 */
@Entity
@Table(name = "enquiry")
public class Enquiry implements java.io.Serializable
{

  private Long id;
  private Collaborationuser collaborationuser;
  private String requestType;
  private String requestDescription;
  private String termName;
  private String termDescription;
  private String intendedValidityRange;
  private Collaborationuser collaborationuserExtPerson;
  private Boolean closedFlag;

  public Enquiry()
  {
  }

  public Enquiry(Long id, Collaborationuser collaborationuser, String requestType, String requestDescription, String termName, String termDescription, String intendedValidityRange, Collaborationuser collaborationuserExtPerson, Boolean closedFlag)
  {
    this.id = id;
    this.collaborationuser = collaborationuser;
    this.requestType = requestType;
    this.requestDescription = requestDescription;
    this.termName = termName;
    this.termDescription = termDescription;
    this.intendedValidityRange = intendedValidityRange;
    this.collaborationuserExtPerson = collaborationuserExtPerson;
    this.closedFlag = closedFlag;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  public Long getId()
  {
    return this.id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "collaborationUserId", nullable=false)
  public Collaborationuser getCollaborationuser()
  {
    return this.collaborationuser;
  }

  public void setCollaborationuser(Collaborationuser collaborationuser)
  {
    this.collaborationuser = collaborationuser;
  }

  @Column(name = "requestType", nullable = false, length = 100)
  public String getRequestType()
  {
    return this.requestType;
  }

  public void setRequestType(String requestType)
  {
    this.requestType = requestType;
  }
  
  @Column(name = "requestDescription", nullable = false, length = 65535)
  public String getRequestDescription()
  {
    return this.requestDescription;
  }

  public void setRequestDescription(String requestDescription)
  {
    this.requestDescription = requestDescription;
  }

  @Column(name = "termName", length = 100)
  public String getTermName()
  {
    return this.termName;
  }

  public void setTermName(String termName)
  {
    this.termName = termName;
  }

  @Column(name = "termDescription", length = 65535)
  public String getTermDescription()
  {
    return this.termDescription;
  }

  public void setTermDescription(String termDescription)
  {
    this.termDescription = termDescription;
  }

  @Column(name = "intendedValidityRange", length = 100)
  public String getIntendedValidityRange()
  {
    return this.intendedValidityRange;
  }

  public void setIntendedValidityRange(String intendedValidityRange)
  {
    this.intendedValidityRange = intendedValidityRange;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "extPerson")
  public Collaborationuser getCollaborationuserExtPerson()
  {
    return this.collaborationuserExtPerson;
  }

  public void setCollaborationuserExtPerson(Collaborationuser collaborationuserExtPerson)
  {
    this.collaborationuserExtPerson = collaborationuserExtPerson;
  }
  
  @Column(name="closedFlag")
  public Boolean getClosedFlag() {
      return this.closedFlag;
  }
    
  public void setClosedFlag(Boolean closedFlag) {
      this.closedFlag = closedFlag;
  }
}