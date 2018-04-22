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
     * ִ����ɾ�Ĳ���
     * @param con  ���Ӷ���
     * @param sql  SQL���
     * @param objects �滻sql�����ռλ���Ĳ���
     * @return ��Ӱ�������
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
			throw new DbException("ִ��sql����Ƿ����쳣", e);
		}
    }
    /**
     * ִ�в�ѯ����
     * @param con ���ݿ����Ӷ���
     * @param sql SQL���
     * @param objects  �滻SQL�����ռλ���Ĳ���
     * @return  ����������α꣩
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
			throw new DbException("ִ��SQL���ʱ�����쳣", e);
		}
    }

}
