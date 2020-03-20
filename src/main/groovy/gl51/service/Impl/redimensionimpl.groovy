package gl51.service.lmpl

import gl51.data.photo
import gl51.service.fetch
import gl51.service.filigrane
import gl51.service.redimension

import javax.inject.Inject

class redimensionimpl implements redimension{
    @Inject fetch FetchService

    photo redimension() {

        photo picture = fetchService.fetch()
        photo.px(1024)
        photo.px(1024)
        return photo


    }

}