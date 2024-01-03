/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.client.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLWarning;
import java.sql.Statement;


public abstract class AbstractBaseStatement implements Statement {
  protected abstract void validateState()
      throws SQLException;

  @Override
  public void addBatch(String sql)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void cancel()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void clearBatch()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void clearWarnings()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void closeOnCompletion()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int[] executeBatch()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int executeUpdate(String sql)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int executeUpdate(String sql, int autoGeneratedKeys)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int executeUpdate(String sql, int[] columnIndexes)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int executeUpdate(String sql, String[] columnNames)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int getFetchDirection()
      throws SQLException {
    return java.sql.ResultSet.FETCH_FORWARD;
  }

  @Override
  public void setFetchDirection(int direction)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int getFetchSize()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void setFetchSize(int rows)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public java.sql.ResultSet getGeneratedKeys()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int getMaxFieldSize()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void setMaxFieldSize(int max)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public int getMaxRows()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void setMaxRows(int max)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public boolean getMoreResults()
      throws SQLException {
    return false;
  }

  @Override
  public boolean getMoreResults(int current)
      throws SQLException {
    return false;
  }

  @Override
  public int getQueryTimeout()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void setQueryTimeout(int seconds)
      throws SQLException {
  }

  @Override
  public int getResultSetConcurrency()
      throws SQLException {
    return java.sql.ResultSet.CONCUR_READ_ONLY;
  }

  @Override
  public int getResultSetHoldability()
      throws SQLException {
    return java.sql.ResultSet.HOLD_CURSORS_OVER_COMMIT;
  }

  @Override
  public int getResultSetType()
      throws SQLException {
    return ResultSet.TYPE_FORWARD_ONLY;
  }

  @Override
  public int getUpdateCount()
      throws SQLException {
    return 0;
  }

  @Override
  public SQLWarning getWarnings()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public boolean isCloseOnCompletion()
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public boolean isPoolable()
      throws SQLException {
    return false;
  }

  @Override
  public void setPoolable(boolean poolable)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public boolean isWrapperFor(Class<?> iface)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void setCursorName(String cursorName)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public void setEscapeProcessing(boolean enable)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }

  @Override
  public <T> T unwrap(Class<T> iface)
      throws SQLException {
    throw new SQLFeatureNotSupportedException();
  }
}
