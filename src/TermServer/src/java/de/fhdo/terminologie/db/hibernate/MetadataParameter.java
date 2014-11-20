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
package de.fhdo.terminologie.db.hibernate;
// Generated 24.10.2011 10:08:21 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MetadataParameter generated by hbm2java
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(namespace = "de.fhdo.termserver.types")
@Entity
@Table(name = "metadata_parameter")
public class MetadataParameter implements java.io.Serializable
{

  private Long id;
  private CodeSystem codeSystem;
  private ValueSet valueSet;
  private String paramName;
  private String paramDatatype;
  private String metadataParameterType;
  private String languageCd;
  private String description;
  private String paramNameDisplay;
  private Integer maxLength;
  
  private Set<CodeSystemMetadataValue> codeSystemMetadataValues = new HashSet<CodeSystemMetadataValue>(0);
  private Set<ValueSetMetadataValue> valueSetMetadataValues = new HashSet<ValueSetMetadataValue>(0);

  public MetadataParameter()
  {
  }

  public MetadataParameter(String paramName)
  {
    this.paramName = paramName;
  }

  public MetadataParameter(String paramName, String paramDatatype, String metadataParameterType, Set<CodeSystemMetadataValue> codeSystemMetadataValues, Set<ValueSetMetadataValue> valueSetMetadataValues)
  {
    this.paramName = paramName;
    this.paramDatatype = paramDatatype;
    this.metadataParameterType = metadataParameterType;
    this.codeSystemMetadataValues = codeSystemMetadataValues;
    this.valueSetMetadataValues = valueSetMetadataValues;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "codeSystemId")
  public CodeSystem getCodeSystem()
  {
    return this.codeSystem;
  }

  public void setCodeSystem(CodeSystem codeSystem)
  {
    this.codeSystem = codeSystem;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "valueSetId")
  public ValueSet getValueSet()
  {
    return this.valueSet;
  }

  public void setValueSet(ValueSet valueSet)
  {
    this.valueSet = valueSet;
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

  @Column(name = "paramName", nullable = false, length = 65535)
  public String getParamName()
  {
    return this.paramName;
  }

  public void setParamName(String paramName)
  {
    this.paramName = paramName;
  }

  @Column(name = "paramDatatype", length = 65535)
  public String getParamDatatype()
  {
    return this.paramDatatype;
  }

  public void setParamDatatype(String paramDatatype)
  {
    this.paramDatatype = paramDatatype;
  }

  @Column(name = "metadataParameterType", length = 30)
  public String getMetadataParameterType()
  {
    return this.metadataParameterType;
  }

  public void setMetadataParameterType(String metadataParameterType)
  {
    this.metadataParameterType = metadataParameterType;
  }

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "metadataParameter")
  public Set<CodeSystemMetadataValue> getCodeSystemMetadataValues()
  {
    return this.codeSystemMetadataValues;
  }

  public void setCodeSystemMetadataValues(Set<CodeSystemMetadataValue> codeSystemMetadataValues)
  {
    this.codeSystemMetadataValues = codeSystemMetadataValues;
  }

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "id")
  public Set<ValueSetMetadataValue> getValueSetMetadataValues()
  {
    return this.valueSetMetadataValues;
  }

  public void setValueSetMetadataValues(Set<ValueSetMetadataValue> valueSetMetadataValues)
  {
    this.valueSetMetadataValues = valueSetMetadataValues;
  }
  
  @Column(name = "languageCd", nullable = false)
  public String getLanguageCd()
  {
    return this.languageCd;
  }

  public void setLanguageCd(String languageCd)
  {
    this.languageCd = languageCd;
  }
  
  
  @Column(name = "maxLength", nullable = true)
  public Integer getMaxLength()
  {
    return this.maxLength;
  }

  public void setMaxLength(Integer maxLength)
  {
    this.maxLength = maxLength;
  }
  
  @Column(name = "paramNameDisplay", nullable = true)
  public String getParamNameDisplay()
  {
    return this.paramNameDisplay;
  }

  public void setParamNameDisplay(String paramNameDisplay)
  {
    this.paramNameDisplay = paramNameDisplay;
  }
  
  @Column(name = "description", nullable = true)
  public String getDescription()
  {
    return this.description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  
}
