package com.promise.cn.common.vo
{
	[RemoteClass(alias="com.promise.cn.common.domain.Police")]
	[Bindable]
	public class Police 
	{
		private var _id:String;
		private var _name:String;
		private var _code:String;
		public var phone:String;
		private var _createDate:String;
		private var _dept:Dept;
		
		public function Police(object:Object=null):void
		{
			if(object!=null){
				this.id = object.id;
				this.name = object.name;
				this.code = object.code;
				this.createDate = object.createDate;
				this.dept = object.dept;
				this.phone = object.phone;
			}
		}
		
		public function get codeAndName():String{
			return name+"("+code+")";
		}
		
		public function get id():String
		{
			return _id;
		}
		
		public function set id(__id:String):void
		{
			_id = __id;
		}
		public function get name():String
		{
			return _name;
		}
		
		public function set name(__name:String):void
		{
			_name = __name;
		}
		public function get code():String
		{
			return _code;
		}
		
		public function set code(__code:String):void
		{
			_code = __code;
		}
		public function get createDate():String
		{
			return _createDate;
		}
		
		public function set createDate(__createDate:String):void
		{
			_createDate = __createDate;
		}
		public function get dept():Dept
		{
			return _dept;
		}
		
		public function set dept(__dept:Dept):void
		{
			_dept = __dept;
		}
		
	}
}