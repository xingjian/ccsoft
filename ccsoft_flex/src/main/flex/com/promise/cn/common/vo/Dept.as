package com.promise.cn.common.vo
{
	import mx.collections.ArrayCollection;

	[RemoteClass(alias="com.promise.cn.common.domain.Dept")]
	[Bindable]
	public class Dept
	{
		public  var id:String;
		public var code:String;
		public var name:String;
		public var createTime:String;
		public var parent:Dept;
		public var children:ArrayCollection;
		public var leaf:String;// 0表示不是叶子 1表示叶子
		public var state:Boolean;
		
		public function Dept(object:Object=null)
		{
			if(null!=object){
				this.id = object.id;
				this.code = object.id;
				this.name = object.name;
				this.createTime = object.createTime;
				this.parent = object.parent;
				this.children = object.children;
				this.leaf = object.leaf;
				this.state = object.state;
			}
		}
	}
}