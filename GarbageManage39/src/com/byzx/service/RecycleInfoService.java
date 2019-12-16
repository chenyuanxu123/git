package com.byzx.service;

import java.util.List;
import java.util.Map;

import com.byzx.model.RecycleInfo;
import com.byzx.model.RecycleLinkmanInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface RecycleInfoService {
	
	
	//���һ���վ������Ϣҵ����ӿ�
	public JSONArray findAllRecycleInfo(Map<String,Object> map);
	
    //���һ���վ������Ϣ������ҵ����ӿ�
	public int findAllRecycleInfoConut(Map<String,Object> map);
	
	//��������վ��Ϣҵ����ӿ�
	public int saveRecycleInfo(RecycleInfo recycleInfo);
	
	//��������վ��Ϣҵ����ӿ�
	public int saveRecycleLinkmanInfo(Map<String,Object> map);
	
	//�޸Ļ���վ��Ϣҵ����ӿ�
	public int updateRecycleInfo(RecycleInfo recycleInfo);
	
	//�޸Ļ���վ�ӱ���Ϣҵ����ӿ�
	public int updateRecycleLinkmanInfo(Map<String,Object> map);
	
	//ɾ������վ��Ϣҵ����ӿ�
	public int deleteRecycleInfo(String recycleInfoIds);
	
	//���һ���վ�������ݵ�id��ҵ����ӿ�
	public int getMaxDataId();
	
	//���һ���վ����ҵ����ӿ�
	public JSONArray findRecycleNames(); 
	
	//���һ���վλ��ҵ����ӿ�
	public List<String>  findRecycleSite();
	
	//ͨ��λ�ò��һ���վ��Ϣҵ����ӿ�
	public  JSONObject  findRecycleInfoBySite(String  recycle_site);
	
	//ɾ������վ��Ϣҵ����ӿ�
	public int deleteRecycleInfo2(Integer recycle_id);
	
	

}
