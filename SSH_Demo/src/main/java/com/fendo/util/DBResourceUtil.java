package com.fendo.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBResourceUtil {
	
	private DBResourceUtil(){
		throw new AssertionError();
	}
	
	 /**
     * 执行增删改操作
     * @param con  连接对象
     * @param sql  SQL语句
     * @param objects 替换sql语句中占位符的参数
     * @return 受影响的行数
     */
    public static int excuteUpdate(Connection con,String sql,Object...objects){
   	try(PreparedStatement stmt = con.prepareStatement(sql)) {
			for(int i = 0; i<objects.length; ++i){
				stmt.setObject(i+1, objects[i]);
			}
			return stmt.executeUpdate();
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DbException("执行sql语句是发生异常", e);
		}
    }
    /**
     * 执行查询操做
     * @param con 数据库连接对象
     * @param sql SQL语句
     * @param objects  替换SQL语句中占位符的参数
     * @return  结果集对象（游标）
     */
    public static ResultSet executeQuery(Connection con,String sql,Object...objects){
   	 try {
			PreparedStatement stmt = con.prepareStatement(sql);
			 for(int i=0;i<objects.length;++i){
				 stmt.setObject(i+1, objects[i]);
			 }
			 return stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DbException("执行SQL语句时发生异常", e);
		}
    }

}
