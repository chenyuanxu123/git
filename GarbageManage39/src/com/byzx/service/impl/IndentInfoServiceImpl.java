package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.IndentInfoDao;
import com.byzx.dao.RecycleInfoDao;
import com.byzx.dao.UserInfoDao;
import com.byzx.model.IndentInfo;
import com.byzx.model.RecycleInfo;
import com.byzx.model.UserInfo;
import com.byzx.service.IndentInfoService;
import com.byzx.util.DateUtil;
import com.byzx.util.Md5;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class IndentInfoServiceImpl implements IndentInfoService {
	
	@Autowired
	private IndentInfoDao indentInfoDao;
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Autowired
	private RecycleInfoDao recycleInfoDao;
    
	
	//�������ж���ҵ�����
	@Override
	public JSONArray findAllIndentInfo(Map<String, Object> map) {
		List<IndentInfo> indentList=indentInfoDao.findAllIndentInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<indentList.size();i++) {
			String recycle_name=recycleInfoDao.findRecycleName(indentList.get(i).getRecycle_id());
			String receive_user_name=userInfoDao.findReceiveUserName(indentList.get(i).getReceive_user_id());
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("indent_id", indentList.get(i).getIndent_id());
			jsonObject.put("indent_type", indentList.get(i).getIndent_type());
			jsonObject.put("classify_if", indentList.get(i).getClassify_if());
			jsonObject.put("indent_intime", indentList.get(i).getIndent_intime());
			jsonObject.put("indent_outtime", indentList.get(i).getIndent_outtime());
			jsonObject.put("deal_way", indentList.get(i).getDeal_way());
			jsonObject.put("inuser_id", indentList.get(i).getInuser_id());
			jsonObject.put("inuser_detail_address", indentList.get(i).getInuser_detail_address());
			jsonObject.put("receive_user_name", receive_user_name);
			jsonObject.put("recycle_name",recycle_name);
			jsonObject.put("receiving_time", indentList.get(i).getReceiving_time());
			jsonObject.put("refuse_weight", indentList.get(i).getRefuse_weight());
			jsonObject.put("indent_img", indentList.get(i).getIndent_img());
			jsonObject.put("deal_money", indentList.get(i).getDeal_money());
			jsonObject.put("deal_integral", indentList.get(i).getDeal_integral());
			jsonObject.put("indent_status", indentList.get(i).getIndent_status());
			jsonObject.put("state", indentList.get(i).getState());
			jsonObject.put("createtime", indentList.get(i).getCreatetime());
			jsonObject.put("remark", indentList.get(i).getRemark());
				
			jsonArray.add(jsonObject);
		}
		return jsonArray;
		
	}

	//�������ж�����������ҵ�����
	@Override
	public int findAllIndentInfoConut(Map<String, Object> map) {
		return indentInfoDao.findAllIndentInfoConut(map);
	}
    
	//ͨ��״̬==2��δ����������ѯ���У�ҵ�����
	@Override
	public JSONArray findAllIndentInfoByStatus(Map<String, Object> map) {
		List<IndentInfo> indentList=indentInfoDao.findAllIndentInfoByStatus(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<indentList.size();i++) {
			String recycle_name=recycleInfoDao.findRecycleName(indentList.get(i).getRecycle_id());
			String receive_user_name=userInfoDao.findReceiveUserName(indentList.get(i).getReceive_user_id());
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("indent_id", indentList.get(i).getIndent_id());
			jsonObject.put("indent_type", indentList.get(i).getIndent_type());
			jsonObject.put("classify_if", indentList.get(i).getClassify_if());
			jsonObject.put("indent_intime", indentList.get(i).getIndent_intime());
			jsonObject.put("indent_outtime", indentList.get(i).getIndent_outtime());
			jsonObject.put("deal_way", indentList.get(i).getDeal_way());
			jsonObject.put("inuser_id", indentList.get(i).getInuser_id());
			jsonObject.put("inuser_detail_address", indentList.get(i).getInuser_detail_address());
			jsonObject.put("receive_user_name",receive_user_name);
			jsonObject.put("recycle_name",recycle_name);
			jsonObject.put("receiving_time", indentList.get(i).getReceiving_time());
			jsonObject.put("refuse_weight", indentList.get(i).getRefuse_weight());
			jsonObject.put("indent_img", indentList.get(i).getIndent_img());
			jsonObject.put("deal_money", indentList.get(i).getDeal_money());
			jsonObject.put("deal_integral", indentList.get(i).getDeal_integral());
			jsonObject.put("indent_status", indentList.get(i).getIndent_status());
			jsonObject.put("remark", indentList.get(i).getRemark());
				
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
    
	//ͨ��״̬==2��δ����������ѯ��������ҵ�����
	@Override
	public int findAllIndentInfoByStatusConut(Map<String, Object> map) {
		return indentInfoDao.findAllIndentInfoByStatusConut(map);
	}
   
	//�޸�id
	@Override
	public int updateIndentStatus(String indentIds,String userIds) {
		int count=0;
		int result=0;
		IndentInfo  indentInfo =new  IndentInfo();
		String Ids[]=indentIds.split(",");
		String uIds[]=userIds.split(",");
		int i=0;
		int j=0;
		for(i=0;i<Ids.length;i++) {
			indentInfo.setReceiving_time(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
			indentInfo.setIndent_id(Integer.parseInt(Ids[i]));
	       for(j=0;j<uIds.length;j++) {
	    	   if(i==j){
	    		   indentInfo.setReceive_user_id(Integer.parseInt(uIds[j]));
	    		   result=indentInfoDao.updateIndentStatus(indentInfo);
	    	   }else {
	    		  continue; 
	    	   }
			}
			if(result>0) {
				count++;
		}
		}
		return count;
	}
  
	
	     //��������ҵ�����
			@Override
			public JSONArray findAllIndentType() {
				List<IndentInfo> indentList=indentInfoDao.findAllIndentType();
				JSONArray jsonArray=new JSONArray();
				for(int i=0;i<indentList.size();i++) {
					JSONObject jsonObject=new JSONObject();
					if(indentList.get(i).getIndent_type()==0) {
					jsonObject.put("indent_type", "���ŷ���");
					}else if(indentList.get(i).getIndent_type()==1) {
					jsonObject.put("indent_type", "��������");
					}
					jsonArray.add(jsonObject);
				}
				return jsonArray;
			}
		
			
			//����״̬ҵ�����
			@Override
			public JSONArray findAllIndentStatus() {
				List<IndentInfo> indentList=indentInfoDao.findAllIndentStatus();
				JSONArray jsonArray=new JSONArray();
				for(int i=0;i<indentList.size();i++) {
					JSONObject jsonObject=new JSONObject();
					if(indentList.get(i).getIndent_status()==0) {
					jsonObject.put("indent_type", "����ɶ���");
					}else if(indentList.get(i).getIndent_status()==1) {
					jsonObject.put("indent_type", "���ڴ���");
					}else if(indentList.get(i).getIndent_status()==2) {
						jsonObject.put("indent_type", "δ�Ӷ���");
					}
					jsonArray.add(jsonObject);
				}
				return jsonArray;
			}
    
	
	//�޸���ɶ���ʱ�������
	@Override
	public int saveIndentInfo(IndentInfo indentInfo) {
		indentInfo.setIndent_type(0);
		indentInfo.setIndent_outtime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		return indentInfoDao.saveIndentInfo(indentInfo);
	}

}
