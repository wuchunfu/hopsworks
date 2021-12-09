/*
 * This file is part of Hopsworks
 * Copyright (C) 2020, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package io.hops.hopsworks.common.featurestore.query.filter;

import io.hops.hopsworks.common.featurestore.query.Feature;
import io.hops.hopsworks.common.featurestore.query.SqlCondition;

import java.util.List;

public class Filter {

  private List<Feature> features;
  private SqlCondition condition;
  private String value;
  
  public Filter(List<Feature> features, SqlCondition condition, String value) {
    this.features = features;
    this.condition = condition;
    this.value = value;
  }
  
  public List<Feature> getFeatures() {
    return features;
  }
  
  public void setFeatures(List<Feature> features) {
    this.features = features;
  }
  
  public SqlCondition getCondition() {
    return condition;
  }
  
  public void setCondition(SqlCondition condition) {
    this.condition = condition;
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
}

