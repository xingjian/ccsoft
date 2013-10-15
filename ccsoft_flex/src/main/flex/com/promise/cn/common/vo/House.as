package com.promise.cn.common.vo
{
	[RemoteClass(alias="com.promise.cn.common.domain.House")]
	[Bindable]
	public class House 
	{
		private var _id:String;
		private var _name:String;
		private var _code:String;
		private var _police:Police;
		private var _fzMessage:String;
		private var _remark:String;
		private var _zlzMessage:String;
		private var _houseQMessage:String;
		private var _houseQImage:String;
		private var _houseHMessage:String;
		private var _houseHImage:String;
		private var _firstFloorImage:String;
		private var _secondFloorImage:String;
		private var _thirdFloorImage:String;
		private var _address:String;
		private var _fzphone:String;
		private var _zlzphone:String;
		private var _x:Number;
		private var _y:Number;
		
		public function House(object:Object=null):void
		{
			if(object!=null){
				this.id = object.id;
				this.name = object.name;
				this.code = object.code;
				this.police = object.police;
				this.fzMessage = object.fzMessage;
				this.remark = object.remark;
				this.zlzMessage = object.zlzMessage;
				this.houseQMessage = object.houseQMessage;
				this.houseQImage = object.houseQImage;
				this.houseHMessage = object.houseHMessage;
				this.houseHImage = object.houseHImage;
				this.firstFloorImage = object.firstFloorImage;
				this.secondFloorImage = object.secondFloorImage;
				this.thirdFloorImage = object.thirdFloorImage;
				this.address = object.address;
				this.fzphone = object.fzphone;
				this.zlzphone = object.zlzphone;
				this.x = object.x;
				this.y = object.y;
			}
		}
		
		public function get nameAndCode():String{
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
		public function get police():Police
		{
			return _police;
		}
		
		public function set police(__police:Police):void
		{
			_police = __police;
		}
		public function get fzMessage():String
		{
			return _fzMessage;
		}
		
		public function set fzMessage(__fzMessage:String):void
		{
			_fzMessage = __fzMessage;
		}
		public function get remark():String
		{
			return _remark;
		}
		
		public function set remark(__remark:String):void
		{
			_remark = __remark;
		}
		public function get zlzMessage():String
		{
			return _zlzMessage;
		}
		
		public function set zlzMessage(__zlzMessage:String):void
		{
			_zlzMessage = __zlzMessage;
		}
		public function get houseQMessage():String
		{
			return _houseQMessage;
		}
		
		public function set houseQMessage(__houseQMessage:String):void
		{
			_houseQMessage = __houseQMessage;
		}
		public function get houseQImage():String
		{
			return _houseQImage;
		}
		
		public function set houseQImage(__houseQImage:String):void
		{
			_houseQImage = __houseQImage;
		}
		public function get houseHMessage():String
		{
			return _houseHMessage;
		}
		
		public function set houseHMessage(__houseHMessage:String):void
		{
			_houseHMessage = __houseHMessage;
		}
		public function get houseHImage():String
		{
			return _houseHImage;
		}
		
		public function set houseHImage(__houseHImage:String):void
		{
			_houseHImage = __houseHImage;
		}
		public function get firstFloorImage():String
		{
			return _firstFloorImage;
		}
		
		public function set firstFloorImage(__firstFloorImage:String):void
		{
			_firstFloorImage = __firstFloorImage;
		}
		public function get secondFloorImage():String
		{
			return _secondFloorImage;
		}
		
		public function set secondFloorImage(__secondFloorImage:String):void
		{
			_secondFloorImage = __secondFloorImage;
		}
		public function get thirdFloorImage():String
		{
			return _thirdFloorImage;
		}
		
		public function set thirdFloorImage(__thirdFloorImage:String):void
		{
			_thirdFloorImage = __thirdFloorImage;
		}
		public function get address():String
		{
			return _address;
		}
		
		public function set address(__address:String):void
		{
			_address = __address;
		}
		public function get fzphone():String
		{
			return _fzphone;
		}
		
		public function set fzphone(__fzphone:String):void
		{
			_fzphone = __fzphone;
		}
		public function get zlzphone():String
		{
			return _zlzphone;
		}
		
		public function set zlzphone(__zlzphone:String):void
		{
			_zlzphone = __zlzphone;
		}
		public function get x():Number
		{
			return _x;
		}
		
		public function set x(__x:Number):void
		{
			_x = __x;
		}
		public function get y():Number
		{
			return _y;
		}
		
		public function set y(__y:Number):void
		{
			_y = __y;
		}
		
	}
}