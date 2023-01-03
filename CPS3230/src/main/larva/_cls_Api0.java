package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_Api0 implements _callable{

public static PrintWriter pw; 
public static _cls_Api0 root;

public static LinkedHashMap<_cls_Api0,_cls_Api0> _cls_Api0_instances = new LinkedHashMap<_cls_Api0,_cls_Api0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\Ronnie\\Desktop\\workspace\\CPS3230/src/main/output_Api.txt");

root = new _cls_Api0();
_cls_Api0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_Api0 parent; //to remain null - this class does not have a parent!
int no_automata = 1;
 public int TotAlerts =0 ;
 public boolean LoggedIn =false ;
 public boolean ViewingAlerts =false ;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_Api0() {
}

public void initialisation() {
}

public static _cls_Api0 _get_cls_Api0_inst() { synchronized(_cls_Api0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_Api0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_Api0_instances){
_performLogic_Api(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_Api0[] a = new _cls_Api0[1];
synchronized(_cls_Api0_instances){
a = _cls_Api0_instances.keySet().toArray(a);}
for (_cls_Api0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_Api0_instances){
_cls_Api0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_Api = 116;

public void _performLogic_Api(String _info, int... _event) {

_cls_Api0.pw.println("[Api]AUTOMATON::> Api("+") STATE::>"+ _string_Api(_state_id_Api, 0));
_cls_Api0.pw.flush();

if (0==1){}
else if (_state_id_Api==113){
		if (1==0){}
		else if ((_occurredEvent(_event,212/*RemoveAlerts*/))){
		TotAlerts =0 ;

		_state_id_Api = 113;//moving to state AlertsDeleted
		_goto_Api(_info);
		}
		else if ((_occurredEvent(_event,210/*UploadAlerts*/)) && (TotAlerts <5 )){
		TotAlerts ++;

		_state_id_Api = 112;//moving to state AlertsUploaded
		_goto_Api(_info);
		}
		else if ((_occurredEvent(_event,208/*LogIn*/))){
		LoggedIn =true ;

		_state_id_Api = 114;//moving to state LoggedIn
		_goto_Api(_info);
		}
}
else if (_state_id_Api==115){
		if (1==0){}
		else if ((_occurredEvent(_event,212/*RemoveAlerts*/)) && (ViewingAlerts ==false )){
		TotAlerts =0 ;

		_state_id_Api = 116;//moving to state RestartAPI
		_goto_Api(_info);
		}
}
else if (_state_id_Api==116){
		if (1==0){}
		else if ((_occurredEvent(_event,210/*UploadAlerts*/)) && (TotAlerts <5 )){
		TotAlerts ++;

		_state_id_Api = 112;//moving to state AlertsUploaded
		_goto_Api(_info);
		}
		else if ((_occurredEvent(_event,212/*RemoveAlerts*/))){
		TotAlerts =0 ;

		_state_id_Api = 113;//moving to state AlertsDeleted
		_goto_Api(_info);
		}
		else if ((_occurredEvent(_event,208/*LogIn*/))){
		LoggedIn =true ;

		_state_id_Api = 114;//moving to state LoggedIn
		_goto_Api(_info);
		}
}
else if (_state_id_Api==112){
		if (1==0){}
		else if ((_occurredEvent(_event,210/*UploadAlerts*/)) && (TotAlerts <5 )){
		TotAlerts ++;

		_state_id_Api = 112;//moving to state AlertsUploaded
		_goto_Api(_info);
		}
		else if ((_occurredEvent(_event,212/*RemoveAlerts*/))){
		TotAlerts =0 ;

		_state_id_Api = 113;//moving to state AlertsDeleted
		_goto_Api(_info);
		}
		else if ((_occurredEvent(_event,208/*LogIn*/))){
		LoggedIn =true ;

		_state_id_Api = 114;//moving to state LoggedIn
		_goto_Api(_info);
		}
}
else if (_state_id_Api==114){
		if (1==0){}
		else if ((_occurredEvent(_event,214/*ViewingAlerts*/)) && (LoggedIn ==true )){
		ViewingAlerts =true ;

		_state_id_Api = 115;//moving to state ViewingAlerts
		_goto_Api(_info);
		}
}
}

public void _goto_Api(String _info){
_cls_Api0.pw.println("[Api]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_Api(_state_id_Api, 1));
_cls_Api0.pw.flush();
}

public String _string_Api(int _state_id, int _mode){
switch(_state_id){
case 113: if (_mode == 0) return "AlertsDeleted"; else return "AlertsDeleted";
case 115: if (_mode == 0) return "ViewingAlerts"; else return "ViewingAlerts";
case 116: if (_mode == 0) return "RestartAPI"; else return "RestartAPI";
case 112: if (_mode == 0) return "AlertsUploaded"; else return "AlertsUploaded";
case 114: if (_mode == 0) return "LoggedIn"; else return "LoggedIn";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}