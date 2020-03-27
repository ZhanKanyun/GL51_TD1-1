package gl51.service.lmpl

import gl51.data.photo
import gl51.service.fetch
import gl51.service.filigrane
import gl51.service.thumbnail

import javax.inject.Inject

class ThumbnailImpl implements thumbnail {

    @Inject FiligraneService filigraneService

    Picture thumbnail() {
        photo picture = fetchlmpl.fetch()
        photo.px(50)
        picture.px(50)
        filigrane.filigrane(photo)

        return picture


    }

}
