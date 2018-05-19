package com.fendo.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fendo.entity.Player;


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
    
    public static PlayerDto getPlayerDtos(Player temPlayer,Integer scorenum,Integer clsnum,Integer marjronum,Integer deptnum,Integer schoolnum){
    	    PlayerDto playerDto = new PlayerDto();
    		playerDto.setId(temPlayer.getPlayerID());
    		playerDto.setName(temPlayer.getPlayerName());
    		playerDto.setSex(temPlayer.getSex());
    		playerDto.setGrade(temPlayer.getGrade());
    		playerDto.setCls(temPlayer.getClasses());
    		playerDto.setMarjor(temPlayer.getMajor());
    		playerDto.setDept(temPlayer.getDepName());
    		playerDto.setScore(temPlayer.getScore());
    		playerDto.setScorenum(scorenum);
    		playerDto.setClsnum(clsnum);
    		playerDto.setMarjornum(marjronum);
    		playerDto.setDeptnum(deptnum);
    		playerDto.setSchoolnum(schoolnum);
		return playerDto;
    }

}
