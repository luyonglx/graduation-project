/**
 * Created by LUYONG on 2015/1/8.
 */
Ext.define("study-system.view.Viewport",{
      extend:'Ext.container.Viewport',
      layout:'border',//布局
      items:[
          {
        	  region:'north',
        	  height:100,
        	  
        	  html:'<h1>hello world</>'
          },{
        	  title:'菜单',
        	  width:180,
        	  collapsible: true,
        	  region:'west'
          },{
        	  title:'内容',
        	  tbar:[
        	        {
        	        	text:'确定',
        	        	handler:function(){
        	        		Ext.create('Ext.window.Window',{
        	        			width:300,
        	        			height:260
        	        		}).show();
        	        	}
        	        
        	        	}
        	        ],
          
        	  region:'center'
          },{
        	  region:'south',
        	  html:'<p>版权：浙江工业大学@卢勇</p>',
        	  height:30
          }
      ]
});
