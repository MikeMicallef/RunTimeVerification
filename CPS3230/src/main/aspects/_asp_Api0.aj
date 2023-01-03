package aspects;

import larva.*;
public aspect _asp_Api0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_Api0.initialize();
}
}
before () : (call(* *.LogIn(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Api0.lock){

_cls_Api0 _cls_inst = _cls_Api0._get_cls_Api0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 208/*LogIn*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 208/*LogIn*/);
}
}
before () : (call(* *.UploadAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Api0.lock){

_cls_Api0 _cls_inst = _cls_Api0._get_cls_Api0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 210/*UploadAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 210/*UploadAlerts*/);
}
}
before () : (call(* *.RemoveAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Api0.lock){

_cls_Api0 _cls_inst = _cls_Api0._get_cls_Api0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 212/*RemoveAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 212/*RemoveAlerts*/);
}
}
before () : (call(* *.ViewingAlerts(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Api0.lock){

_cls_Api0 _cls_inst = _cls_Api0._get_cls_Api0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 214/*ViewingAlerts*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 214/*ViewingAlerts*/);
}
}
}