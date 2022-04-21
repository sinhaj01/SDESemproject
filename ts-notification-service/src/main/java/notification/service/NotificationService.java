package notification.service;

import notification.domain.NotifyInfo;


public interface NotificationService {
    boolean preserve_success(NotifyInfo info);
    boolean order_create_success(NotifyInfo info);
    boolean order_changed_success(NotifyInfo info);
    boolean order_cancel_success(NotifyInfo info);
}
