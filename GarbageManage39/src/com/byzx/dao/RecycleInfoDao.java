package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.RecycleInfo;

public interface RecycleInfoDao {
	
	//���һ���վ������Ϣ�ӿ�
	public  List<RecycleInfo> findAllRecycleInfo(Map<String, Object> map);
	
	//���һ���վ������Ϣ�����ӿ�
	public int findAllRecycleInfoConut(Map<String, Object> map);
	
	//���һ���վ�����½���һ����id�ӿ�
	public int getMaxDataId();
	
	//��ӻ���վ��Ϣ�ӿ�
	public int saveRecycleInfo(RecycleInfo recycleInfo);
	
	//�޸Ļ���վ��Ϣ�ӿ�
	public int updateRecycleInfo(RecycleInfo recycleInfo);
	
	//ɾ������վ��Ϣ�ӿ�
	public int deleteRecycleInfo(Integer recycle_id);
	
	//����id���һ���վ���ƽӿ�
	public String findRecycleName(Integer recycle_id);
	
	//�������л���վ���ƽӿ�
	public List<RecycleInfo> findRecycleNames();
	
	//���һ���վ����λ����Ϣ�ӿ�
	public List<String> findRecycleSite();
	
	//���ݻ���վλ�ò��һ���վ������Ϣ�ӿ�
	public RecycleInfo  findRecycleInfoBySite(String recycle_site);
	
	
	
	

}
